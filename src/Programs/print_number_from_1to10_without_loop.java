package Programs;

public class print_number_from_1to10_without_loop 
{
	public static void print(int a ,int b)
	{
		System.out.print(a+" ");
		if(a<b)
		{
			print(a+1,b);
		}
	}
	public static void main(String[] args) 
	{
		print(1,10);
		
	}

}
