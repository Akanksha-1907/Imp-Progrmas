package Programs;

public class print_prime_number_from_1to50 
{
	public static void main(String[]args)
	{
	int a,b,i,j;
	a=1;
	b=50;
	for(i=a;i<=b;i++)
	{
	for(j=2;j<=i;j++)
	{
	if(i%j==0)
	{
	break;
	}
	}
	if(i==j)
	{
	System.out.println(i+" ");
	}
	}
	}
	

}
