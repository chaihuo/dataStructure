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
		/**
		 * store current root node(for get left child only)
		 */
		BinaryTreeNode currentNode = root;
		while(!toTraversal.isEmpty() || currentNode != null) {
			currentNode = to(toTraversal, currentNode);
		}
	}
	
	private BinaryTreeNode to(Stack<BinaryTreeNode> toTraversal, BinaryTreeNode currentNode) {

		/**
		 * 1.traversal to the leftmost child, and sysout it
		 * stack all root on the way
		 */
		while (currentNode != null) {
			if (currentNode.getLeft() != null) {
				toTraversal.add(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				System.out.println(currentNode.getItem());
				return null;
			}
		}
		
		/**
		 * 2.sysout root and traversal its right child tree
		 */
		BinaryTreeNode stackNode = toTraversal.pop();
		
		if (stackNode.getRight() != null) {
			System.out.println(stackNode.getItem());
			return stackNode.getRight();
		} else {
			System.out.println(stackNode.getItem());
			return null;
		}
	}

}
