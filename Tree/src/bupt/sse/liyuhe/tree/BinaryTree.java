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
	 * bi-tree depth
	 * @param root
	 * @return
	 */
	public int treeDepth(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int right = treeDepth(root.getRight());
		int left = treeDepth(root.getLeft());
		
		return (right > left) ? (right + 1) : (left +1);
	}
	
	private static int depth;
	private static int leftDepth;
	private static int rightDepth;
	public boolean ifBalanced(BinaryTreeNode root, int depth) {
		if (root == null) {
			depth = 0;
			return true;
		}
		
		int leftDepth = depth;
		int rightDepth = depth;
		
		if (ifBalanced(root.getLeft(), leftDepth) && ifBalanced(root.getRight(), rightDepth)) {
			int depthDiff = leftDepth - rightDepth;
			if (depthDiff <= 1 && depthDiff >= -1) {
				depth = 1 + ((leftDepth > rightDepth) ? leftDepth : rightDepth);
				return true;
			}
		}
		return false;
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
