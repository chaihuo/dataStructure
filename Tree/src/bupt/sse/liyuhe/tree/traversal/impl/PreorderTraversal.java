package bupt.sse.liyuhe.tree.traversal.impl;

import java.util.Stack;

import bupt.sse.liyuhe.tree.BinaryTreeNode;
import bupt.sse.liyuhe.tree.traversal.Traversal;

/**
 * preorder: root -> left -> right
 * @author feather
 *
 */
public final class PreorderTraversal implements Traversal {

	
	
	@Override
	public void traversal(BinaryTreeNode root) {
		Stack<BinaryTreeNode> toTraversal = new Stack<BinaryTreeNode>();
		toTraversal.add(root);
		while (!toTraversal.isEmpty()) {
			traversalNext(toTraversal);
		}
	}
	
	private void traversalNext(Stack<BinaryTreeNode> toTraversal) {
		BinaryTreeNode currentNode = toTraversal.pop();
		System.out.println(currentNode.getItem());
		if (currentNode.getRight() != null) {
			toTraversal.add(currentNode.getRight());
		}
		if (currentNode.getLeft() != null) {
			toTraversal.add(currentNode.getLeft());
		}
	}

	@Override
	public void recurTraversal(BinaryTreeNode root) {
		
		if (root != null) {
			System.out.println(root.getItem());
			
			if (root.getLeft() != null) {
				recurTraversal(root.getLeft());
			}
			
			if (root.getRight() != null) {
				recurTraversal(root.getRight());
			}
		}
		
	}
}
