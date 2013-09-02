/**
 * 
 */
package bupt.sse.liyuhe.tree.traversal;

import bupt.sse.liyuhe.tree.BinaryTreeNode;

/**
 * @author feather
 *
 */
public interface Traversal {
	
	/**
	 * print tree node in recurse
	 * @param root
	 */
	public void recurTraversal(BinaryTreeNode root);
	
	/**
	 * print tree node
	 * @param root
	 */
	public void traversal(BinaryTreeNode root);
}
