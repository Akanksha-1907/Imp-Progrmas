package String;

public class seperate_word_of_string_rev 
{
	public static void main(String[] args) 
	{
		
	String s="Manual Testing";
	String a="";
	String b="";
	String s2=s.substring(0,6);
	String s3=s.substring(7,14);
	for(int i=s2.length()-1;i>=0;i--)
	{
		a=a+s2.charAt(i);
	}
	System.out.println(a);
	for(int i=s3.length()-1;i>=0;i--)
	{
		b=b+s3.charAt(i);
	}
	System.out.println(b);
	}

}
