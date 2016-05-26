/**
 * 
 */
package block.easy.practice;

/**
 * @author dandanli
 *
 */
public class MoveZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums = {0, 1, 0, 3, 12, 0, 11, 4, 0};
		moveZeroes(nums);
		for(int i = 0; i < nums.length; i++)
		System.out.print(" " + nums[i]);
	}

	
	public static void moveZeroes(int[] nums)
	{
		
		if(nums == null || nums.length == 0) return ;
		int j = 0;
		for(int i = 0; i < nums.length; i++)
		{
			
			if(nums[i] != 0)
			{
				nums[j++] = nums[i];
			}			
			
		}
		
		while(j < nums.length)
		{
			nums[j++] = 0;
			
		}
	}
	
}
