package block.easy.practice;

import java.awt.datatransfer.StringSelection;

public class AddDigits {

	public static int addDigits(int n)
	{
		int temp = 0;
		while(n >= 10)
		{
			temp += n%10;
			n = n/10;
			
		}
		temp += n;
		
		if(temp > 10)
		{
			addDigits(temp);
		}
		
		return temp;
		
	}
	
	public static void main(String[] args)
	{
		
		int n = 1023;
	//	int nn = 1023%10;
	//	System.out.println("print 1023/10 "  + nn);
		int result = addDigits(n);
		System.out.println("the result is " + result);
		
	}
	
}
