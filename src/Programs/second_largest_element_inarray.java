package Programs;

import java.util.Arrays;

public class second_largest_element_inarray
{

	//Java program to find second largest element in arrays
	public static void main(String[] args) 
	{
		int[] arr= {75,5,65,82,94,12,35,34,46,42,38,52,1,9,12,755,964};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i +" ");
		}
		
		int secondlargest=arr[arr.length-2];
		System.out.println();
		System.out.print("Second Largest Number is - "+secondlargest);
		
	}

}
