package Programs;

public class reverse_only_words 
{
	public static void main(String[] args)
	{
		String s="Akanksha1907Hedaoo";
		String rev="";
		String rev1="";
		String s1=s.substring(0,8);
		String s2=s.substring(8,12);
		String s3=s.substring(12,18);
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.print(rev);
		System.out.print(s2);
		for(int i=s3.length()-1;i>=0;i--)
		{
			rev1=rev1+s3.charAt(i);
		}
		System.out.print(rev1);
		
	}

}
