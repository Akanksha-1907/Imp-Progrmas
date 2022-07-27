package Programs;

import java.util.Arrays;

public class sort_alphabetically 
{
	public static void main(String[] args) 
	{
		String s="my name is akanksha";
		char[]s1=s.toCharArray();
		Arrays.sort(s1);
		for(char a:s1)
		{
			System.out.print(a);
		}
		
	}
       
}
