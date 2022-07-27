package Programs;

public class Prime_or_not
{

	//Check whether the given number is prime or not
	
	public static void main(String[] args) 
	{
		int num=91;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("It is a Prime Number.");
			}
			else
			{
				System.out.println("It is not a prime Number.");
			}
		}
		else
		{
			System.out.println("It is not a prime Number.");
		}
	}


}
