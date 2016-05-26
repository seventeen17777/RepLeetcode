/**
 * 
 */
package block.easy.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dandanli
 *
 */
public class IntersectionTwoArrays {

	/**
	 * @param args
	 */
	
	public int[] intersection2Arrays(int[] a, int[] b)
	{
		//unqiue
		//Set<Integer> set = new HashSet<>();
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i = 1; i < a.length; i++)
		{
			mp.put(i, a[i]);
		}
		
		int[] result = {};
		for(int j = 0; j < b.length; j++)
		{
			if(mp.containsValue(b[j]))
			
				result[j] = b[j];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
