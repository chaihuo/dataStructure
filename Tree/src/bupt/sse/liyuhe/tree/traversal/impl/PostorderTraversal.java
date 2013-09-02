package bupt.sse.liyuhe.tree.traversal.impl;

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
		// TODO Auto-generated method stub

	}

}
