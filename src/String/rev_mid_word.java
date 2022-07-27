package String;

public class rev_mid_word
{
	public static void main(String[] args)
	{
		String s="Sachin Ramesh Tendulkar";
		String s3="";
		String s2=s.substring(7,13);
		//System.out.println(s2);
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3=s3+s2.charAt(i);
		}
		String s4=s.substring(0,6);
		System.out.print(s4+" ");
		System.out.print(s3+" ");
		String s5=s.substring(14,23);
		System.out.print(s5+" ");
		
		
	}

}
