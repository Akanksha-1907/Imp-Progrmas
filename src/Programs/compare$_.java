package Programs;

public class compare$_ 
{
	public static void main(String[] args) 
	{
		String s="$1234.45";
		String s1="1,234.45";
		String a=s.replaceAll("[$]", "");
		String b=s1.replaceAll("[,]", "");
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("String s and s1 are equal");
		}
		else
		{
			System.out.println("String s and s1 are not equal");
		}
		
	}

}
