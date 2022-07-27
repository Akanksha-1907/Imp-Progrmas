package Programs;

public class Sumof_onlunumbers_from_string 
{
	public static void main(String[] args) 
	{
		String s="vais45210nhshgd5574";
		String  s1=s.replaceAll("[a-z]", "");
		System.out.println(s1);
		int b=s1.length();
		char c[]=s1.toCharArray();
		int sum=0,j=0;
		
		for(int i=0;i<b;i++)
		{
			if((c[i]>='0')&&(c[i]<='9'))
			{
				sum=(sum+c[i]-'0');
			}
			j++;
		}
		System.out.println("Sum of digits is: "+sum);
	}
}
