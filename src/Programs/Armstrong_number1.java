package Programs;

public class Armstrong_number1 
{

	public static void main(String[] args) 
	{
		int num=153;
		int digit=0;;
		int sum=0;
		int original=num;
		while(num>0)
		{
			digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(original==sum)
		{
			System.out.println("It is a Armstrong Number");
		}
		else
		{
			System.out.println("It is not a Armstrong Number");
		}
		
		
	}
}
