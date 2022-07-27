package Programs;

public class palindrome_number1 
{
	public static void main(String[] args) 
	{
		int n=121;
		int revno=n;
		int digit=0;
		int originalno=0;
		
		
		while(revno>0)
		{
			digit=revno%10;
			originalno=(originalno*10)+(digit);
			revno=revno/10;
			
		}
		if(originalno==n)
		{
			System.out.println("It is a Pallindrome number");
		}
		else
		{
			System.out.println("It is not a Pallindrome number");
		}
	}

}
