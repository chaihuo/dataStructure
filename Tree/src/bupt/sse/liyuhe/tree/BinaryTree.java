package bupt.sse.liyuhe.tree;

public class BinaryTree {
	
	/**
	 * root node
	 */
	private BinaryTreeNode rootNode;
	
	/**
	 * count of nodes
	 */
	private int degree = 0;
	
	/**
	 * create full binary tree
	 * @param size Nodes count
	 * @return
	 */
	public BinaryTreeNode createFullBinaryTree(int size) {
		degree = 0;
		return recurCreateFullBinaryTree(1, size);
	}
	
	/**
	 * recur create full binary tree (preorder)
	 * ROOL: node's sequence number <= nodeCount
	 * @param num Current number
	 * @param nodeCount Tree degree
	 * @return
	 */
	private BinaryTreeNode recurCreateFullBinaryTree(int num, int nodeCount) {
		degree++;
		rootNode = new BinaryTreeNode(num);//根节点  
		//如果有左子树则创建左子树  
		if (num * 2 <= nodeCount) {   
            rootNode.left = recurCreateFullBinaryTree(num * 2, nodeCount);   
            //如果还可以创建右子树，则创建   
        if (num * 2 + 1 <= nodeCount) {
            rootNode.right = recurCreateFullBinaryTree(num * 2 + 1, nodeCount);   
        }
        }
       return (BinaryTreeNode) rootNode;   
	}
	
	/**
	 * 
	 * @param nums
	 * @return
	 */
	public BinaryTreeNode createBinaryTree(int[] nums) {
		return recurCreateBinaryTree(nums, 0);
	}
	
	private BinaryTreeNode recurCreateBinaryTree(int[] nums, int index) {
		//指定索引上的编号不为零上才需创建节点   
        if (nums[index] != 0) {
        	degree++;   
            rootNode = new BinaryTreeNode(nums[index]);//根节点  
            //如果有左子树则创建左子树  
            if ((index + 1) * 2 <= nums.length) {
            	rootNode.left = (BinaryTreeNode) recurCreateBinaryTree(nums, (index + 1) * 2 - 1);   
                //如果还可以创建右子树，则创建   
            	if ((index + 1) * 2 + 1 <= nums.length) {
            		rootNode.right = (BinaryTreeNode) recurCreateBinaryTree(nums, (index + 1) * 2);
                }
            }
            return (BinaryTreeNode) rootNode;   
        }   
        return null;
	}
	
	/**
	 * 
	 * @return Tree degree
	 */
	public int size() {
		return degree;
	}
	
	public BinaryTreeNode getRoot() {
		return rootNode;
	}
}
