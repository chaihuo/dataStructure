package bupt.sse.liyuhe.tree.traversal.impl;

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
		// TODO Auto-generated method stub

	}

}
