package bupt.sse.liyuhe.tree;

public class BinaryTreeNode {
	
	/**
	 * data area
	 */
	int item;
	
	/**
	 * left child
	 */
	private BinaryTreeNode left = null;
	
	 /**
	  * right child
	  */
	private BinaryTreeNode right = null;

	/**
	 * construct function
	 * @param item
	 */
	public BinaryTreeNode(int item) {
		this.item = item;
	}
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
}
