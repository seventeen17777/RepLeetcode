package block.easy.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidAnagram {
	
	
	public static void main(String[] args)
	{
		String s = "dandanli";
		String t = "dandanle";
		boolean b = isAnagram(s, t);
		System.out.println("the result is " + b);
		
				
	}
	
	public static boolean isAnagram(String s, String t)
	{
			
	//	if(s.length() != t.length()) return false;
		
		int[] alphabet = new int[26];
		for(int i = 0; i<s.length(); i++){
			alphabet[s.charAt(i) - 'a']++;
			alphabet[t.charAt(i) - 'a']--;
		}
		
		for(int i : alphabet)
		{
			if(i!=0)
				return false;
		}
		return true;
	}
	
	
	
	public int[] intersect(int[] nums1, int[] nums2)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < nums1.length; i++)
		{
			if(map.containsKey(nums1[i]))
			{
				map.put(nums1[i], map.get(nums1[i])+1);
			}else{
				map.put(nums1[i], 1);
			}
		}
		
		for(int j = 0; j<nums2.length; j++)
		{
			if(map.containsKey(nums2[j])&& map.get(nums2[j]) > 0)
			{
				result.add(nums2[j]);
				map.put(nums2[j], map.get(nums2[j])-1);
			}
				
			
		}
	}
	
}
