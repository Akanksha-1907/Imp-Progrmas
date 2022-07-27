package Programs;

public class count_number_of_digits
{
	public static void main(String[] args) 
	{
		int a=45674;
		int count=0;
		while(a!=0)
		{
			count++;
			a/=10;
		}
		System.out.println(count);
	}
}
		
