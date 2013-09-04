package bupt.sse.liyuhe.tree.traversal.impl;

import bupt.sse.liyuhe.tree.BinaryTree;

public class testTraversal {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 0, 5, 6,};
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree(num);
		
//		PreorderTraversal preT = new PreorderTraversal();
//		preT.recurTraversal(bt.getRoot());
		
//		InorderTraversal it = new InorderTraversal();
//		it.recurTraversal(bt.getRoot());
//		
		PostorderTraversal pt = new PostorderTraversal();
		pt.recurTraversal(bt.getRoot());
		
		
	}

}
