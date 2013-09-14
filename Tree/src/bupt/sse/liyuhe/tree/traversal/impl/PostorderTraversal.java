package bupt.sse.liyuhe.tree.traversal.impl;

import java.util.Stack;

import bupt.sse.liyuhe.tree.BinaryTreeNode;
import bupt.sse.liyuhe.tree.traversal.Traversal;

public final class PostorderTraversal implements Traversal {

	@Override
	public void recurTraversal(BinaryTreeNode root) {
		
		if (root != null) {
			if (root.getLeft() != null) {
				recurTraversal(root.getLeft());
			}
			
			if (root.getRight() != null) {
				recurTraversal(root.getRight());
			}
			
			System.out.println(root.getItem());
		}
	}

	@Override
	public void traversal(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode> toTraversal = new Stack<BinaryTreeNode>();
		
		toTraversal.add(root);
		
		BinaryTreeNode lastNode = null;
		while (!toTraversal.isEmpty()) {
			BinaryTreeNode currentNode = toTraversal.pop();
			
			/**
			 * 1. if leaf, sysout & continue
			 */
			if (currentNode.getLeft() == null && currentNode.getRight() == null) {
				System.out.println(currentNode.getItem());
				lastNode = currentNode;
				continue;
			}
			
			/**
			 * 2. if have 2 children
			 */
			if (currentNode.getLeft() != null && currentNode.getRight() != null) {
				if (currentNode.getLeft().equals(lastNode) || currentNode.getRight().equals(lastNode)) {
					System.out.println(currentNode.getItem());
					lastNode = currentNode;
					continue;
				} else {
					loadNodes(toTraversal, currentNode);
					continue;
				}
			}
			
			/**
			 * 3. if only left child
			 */
			if (currentNode.getLeft() != null && currentNode.getRight() == null) {
				if (currentNode.getLeft().equals(lastNode)) {
					System.out.println(currentNode.getItem());
					lastNode = currentNode;
					continue;
				} else {
					loadNodes(toTraversal, currentNode);
					continue;
				}
			}
			
			/**
			 * 4. if only right child
			 */
			if (currentNode.getLeft() == null && currentNode.getRight() != null) {
				if (currentNode.getRight().equals(lastNode)) {
					System.out.println(currentNode.getItem());
					lastNode = currentNode;
					continue;
				} else {
					loadNodes(toTraversal, currentNode);
					continue;
				}
			}
		}
	}

	private void loadNodes(Stack<BinaryTreeNode> toTraversal, BinaryTreeNode root) {
		toTraversal.add(root);
		if (root.getRight() != null) {
			toTraversal.add(root.getRight());
		}
		if (root.getLeft() != null) {
			toTraversal.add(root.getLeft());
		}
	}
}
