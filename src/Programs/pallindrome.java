package Programs;

public class pallindrome
{
	public static void main(String[] args) 
	{
		String s="Nitin";
		String a="";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			 a=a+s.charAt(i);
		}
		if(s.equalsIgnoreCase(a))
		{
			System.out.println("It is a pallindrome");
		}
		else
		{
			System.out.println("It is not a pallindrome");
		}
		
	}

}
