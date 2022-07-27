package Programs;

public class print_even_odd_fromarray 
{
	//Program to print all even and odd numbers
		public static void main(String[] args) 
		{
			int[] arr = { 12, 85, 75, 20, 76, 94, 10, 54, 53, 27, 79, 35 };
			int even = 0;
			int odd = 0;
			System.out.println("Total even numbers- ");
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[ i] % 2 == 0) 
				{
					System.out.println(arr[i]);
					//even++;
				} 
			}
			System.out.println("Total odd numbers- ");
			for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i]%2!=0)
				{
					System.out.println(arr[i]);
				}
			}

		}


}
