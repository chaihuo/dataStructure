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
//	public BinaryTreeNode createFullBinaryTree(int size) {
//		degree = 0;
//		return recurCreateFullBinaryTree(1, size);
//	}
	
	/**
	 * recur create full binary tree (preorder)
	 * ROOL: node's sequence number <= nodeCount
	 * @param num Current number
	 * @param nodeCount Tree degree
	 * @return
	 */
//	private BinaryTreeNode recurCreateFullBinaryTree(int num, int nodeCount) {
//		degree++;
//		rootNode = new BinaryTreeNode(num);//���ڵ�  
//		//������������򴴽�������  
//		if (num * 2 <= nodeCount) {   
//            rootNode.left = recurCreateFullBinaryTree(num * 2, nodeCount);   
//            //��������Դ������������򴴽�   
//        if (num * 2 + 1 <= nodeCount) {
//            rootNode.right = recurCreateFullBinaryTree(num * 2 + 1, nodeCount);   
//        }
//        }
//       return (BinaryTreeNode) rootNode;   
//	}
	
	/**
	 * 
	 * @param nums
	 */
	public void createBinaryTree(int[] nums) {
		degree = 0;
		this.rootNode = recurCreateBinaryTree(nums, 0);
	}
	
	/**
	 * preorder create
	 * @param nums
	 * @param index
	 * @return
	 */
	private BinaryTreeNode recurCreateBinaryTree(int[] nums, int index) {
		//ָ�������ϵı�Ų�Ϊ���ϲ��贴���ڵ�   
        if (nums[index] != 0) {
        	degree++;   
            BinaryTreeNode root = new BinaryTreeNode(nums[index]);//���ڵ�  

            int leftNodeIndex = (index + 1) * 2 - 1; // left node index
            int rightNodeIndex = (index + 1) * 2; // right node index
            //������������򴴽�������  
            if ((leftNodeIndex + 1) <= nums.length) {
            	root.setLeft(recurCreateBinaryTree(nums, leftNodeIndex));
                //��������Դ������������򴴽�   
            	if ((rightNodeIndex + 1) <= nums.length) {
            		root.setRight(recurCreateBinaryTree(nums, rightNodeIndex));
                }
            }
            return root;
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
