package String;

public class find_duplicate_character_instring
{
	public static void main(String[] args) 
	{
		String str="Akanksha";
		char[] c=str.toCharArray();
		System.out.println("Duplicate Characters are- ");
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[j]);
					break;
				}
			}
		}
		
		
	}

}
