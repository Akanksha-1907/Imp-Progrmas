package String;

public class print_first_and_last_number_from_whole_number 
{
	public static void main(String[] args)
	{
		int s=2154;
		int fdigit=0;
		int ldigit=0;
		ldigit=s%10;
		System.out.println("ldigit- "+ldigit);
		
		while(s!=0)
			{
			fdigit=s%10;
			s/=10;
			}
		System.out.println("fdigit- "+fdigit);
	}

}
