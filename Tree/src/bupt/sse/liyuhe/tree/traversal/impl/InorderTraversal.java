package bupt.sse.liyuhe.tree.traversal.impl;

import java.util.Stack;

import bupt.sse.liyuhe.tree.BinaryTreeNode;
import bupt.sse.liyuhe.tree.traversal.Traversal;

public class InorderTraversal implements Traversal {

	@Override
	public void recurTraversal(BinaryTreeNode root) {
		
		if (root != null) {
			if (root.getLeft() != null) {
				recurTraversal(root.getLeft());
			}
			
			System.out.println(root.getItem());
			
			if (root.getRight() != null) {
				recurTraversal(root.getRight());
			}
		}
	}

	@Override
	public void traversal(BinaryTreeNode root) {
		/**
		 * store root after traversal its left child
		 */
		Stack<BinaryTreeNode> toTraversal = new Stack<BinaryTreeNode>();
		downToLeft(toTraversal, root);
		while(!toTraversal.isEmpty()) {
			ifNext(toTraversal);
		}
	}
	
	/**
	 * traversal a bi-tree to its leftest child
	 * @param toTraversal
	 * @param currentNode
	 */
	private void downToLeft(Stack<BinaryTreeNode> toTraversal, BinaryTreeNode currentNode) {
		
		while (currentNode != null) {
			if (currentNode.getLeft() != null) {
				toTraversal.add(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				System.out.println(currentNode.getItem());
				return;
			}
			
		}
		
		
	}
	
	/**
	 * get a node from toTraversal
	 * @param toTraversal
	 */
	private void ifNext(Stack<BinaryTreeNode> toTraversal) {
		BinaryTreeNode currentNode = toTraversal.pop();
		if (currentNode.getRight() != null) {
			System.out.println(currentNode.getItem());
			downToLeft(toTraversal, currentNode.getRight());
			return;
		} else {
			System.out.println(currentNode.getItem());
			return;
		}
	}

}
