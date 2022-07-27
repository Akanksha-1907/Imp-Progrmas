package Programs;

public class reverse_number 
{
	public static void main(String[] args)
{
     int n=987654;
		int revno=0;
		int digit;
		
		while(n!=0)
		{
			digit=n%10;
			revno=revno*10+digit;
			n=n/10;
		}
		System.out.println(revno);
		
	}

}



