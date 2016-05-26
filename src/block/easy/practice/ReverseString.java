/**
 * 
 */
package block.easy.practice;

/**
 * @author dandanli
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		
	//	String resultString = reverseString2(s);
	//	System.out.println("the reversed string is " + resultString);
		
		byte[] bytes = s.getBytes();
		for(int i = 0; i < bytes.length; i++)
		{
			System.out.println(i + "the byte[i] is " + bytes[i]);
		}

	}
	
	public static String reverseString2(String s)
	{
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s2 = sb.toString();
		return s2;
		//return sb.reverse().toString();
	}
	
	
	
	public static String reverseString(String s)
	{
		StringBuffer sb = new StringBuffer();
		char[] ch = s.toCharArray();
		int i = ch.length - 1;
		while(i >= 0)
		{
			System.out.println("the value of i :" + i);
			sb.append(ch[i]);
			System.out.println("print resersing process " + ch[i]);
			i--;
		}
		
		String s2 = sb.toString();
		return s2;
		
	}

}
