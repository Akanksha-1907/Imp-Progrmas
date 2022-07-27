package Programs;

public class Armstrong_Number
{
	public static void armstrong(int num)
	{
		int cube=0;
		int r;
		int t;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println("It is a Armstrong number");
		}
		else
		{
			System.out.println("It is not a Armstrong number");
		}
	}
	public static void main(String[] args) 
	{
		armstrong(153);
		
	}

}
