package bupt.sse.liyuhe.tree.traversal.impl;

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
		// TODO Auto-generated method stub
		
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
