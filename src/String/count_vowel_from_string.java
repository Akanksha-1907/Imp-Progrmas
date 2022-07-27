package String;

public class count_vowel_from_string 
{
	//java program to count number of vowels from the given string
	
		public static void main(String[] args) 
		{
			String s="You are my rockstar";
			int count=0;
			for(int i=0;i<=s.length()-1;i++)
			{
				if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
				{
					count++;
				}
			}
			
			System.out.println(count);
		}

}
