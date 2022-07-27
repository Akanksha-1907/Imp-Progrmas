package Programs;

public class Armstrong_number_new 
{
	public static void main(String[] args) 
	{
		int num=153;
		int rem=0;
		int a=num;
		int count=0;
		int sum=0;
		while(a!=0)
		{
			count++;
			a=a/10;
		}
		while(num!=0)
		{
			rem=num%10;
			sum+=Math.pow(rem, count);
			num=num/10;
		}
		System.out.println(num);
		
	}

}
