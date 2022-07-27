package String;

public class String_first_word_rev_remaining_asitis
{
	public static void main(String[] args) 
	{
		String s="Sachin Ramesh Tendulkar";
		String s3="";
		String s2=s.substring(0,6);
		
		//System.out.println(s2);
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3=s3+s2.charAt(i);
		}
		System.out.print(s3+" ");
		String s4=s.substring(7,23);
		System.out.println(s4);
	}

}
