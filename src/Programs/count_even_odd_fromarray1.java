package Programs;

public class count_even_odd_fromarray1 
{
	//Program to print total even and odd numbers in array
		public static void main(String[] args)
		{
			int[] arr = { 12, 85, 75, 20, 76, 94, 10, 54, 53, 27, 79, 35, 45 };
			int even = 0;
			int odd = 0;
			for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i]%2==0)
				{
					even++;
					//System.out.println(arr[i]);
				}
				else
				{
					odd++;
				}
			}
			System.out.println("Total even numbers are- "+even);
			System.out.println("Total odd numbers are- "+odd);
			
		}

}
