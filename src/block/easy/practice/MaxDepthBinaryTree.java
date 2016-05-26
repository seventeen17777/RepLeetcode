/**
 * 
 */
package block.easy.practice;

/**
 * @author dandanli
 *
 */
public class MaxDepthBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root)
	{
		
		return root == null? 1:Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
		
		
	}
	
}

class TreeNode
{

	public TreeNode() {
		// TODO Auto-generated constructor stub
		value = 1;
		left = null;
		right = null;
	}
	
	TreeNode left;
	TreeNode right;
	int value;
	
}