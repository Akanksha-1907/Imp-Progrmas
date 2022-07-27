package Programs;

public class array 
{
	public static void main(String[] args) 
	{
		String s[]= {"Test","Java","Test","Java","Test","Java"};
		for(int i=0;i<s.length-1;i++)
		{
			if(s[i]=="Test")
			{
				System.out.print(s[i]+" ");
				break;
			}
		}
		for(int i=0;i<s.length-1;i++)
		{
			if(s[i]=="Java")
			{
				System.out.print(s[i]);
				break;
			}
		}
	}

}
