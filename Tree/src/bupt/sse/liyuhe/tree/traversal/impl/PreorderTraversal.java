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

	private static Stack<BinaryTreeNode> toTraversal = new Stack<BinaryTreeNode>();
	
	@Override
	public void traversal(BinaryTreeNode root) {
	}
	
	private static void travelsalToLeft(BinaryTreeNode root) {
		if (root != null) {
			System.out.println(root.getItem());
		}
		
		BinaryTreeNode toGetLeft = root;
		while (toGetLeft.getLeft() != null) {
			toGetLeft = toGetLeft.getLeft();
			toTraversal.add(toGetLeft);
			System.out.println(toGetLeft.getItem());
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
