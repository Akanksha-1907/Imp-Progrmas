package String;

import java.util.Arrays;

public class anagram 
{
	public static void main(String[] args) 
	{
		String s1="Grab";
		String s2="Brag";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean s3=Arrays.equals(c1, c2);
			if(s3)
			{
				System.out.println(s1+" " +"AND "+s2 +" "+"are ANAGRAM");
			}
			else
			{
				System.out.println(s1 +" "+"AND "+s2+" " +"are not ANAGRAM");
			}
		}
		else
		{
			
	System.out.println(s1 +" "+"AND "+s2+" " +"are not ANAGRAM");
		}
}
}
