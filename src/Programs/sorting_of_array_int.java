package Programs;

import java.util.Arrays;

public class sorting_of_array_int 
{
	public static void main(String[] args) 
	{
	int[] a = { 25, 75, 14, 88, 78, 54, 10, 96, 34, 73, 22 };
	System.out.print("Original Array ");
	System.out.println();
	for (int arr : a) 
	{
		System.out.println(arr + " ");
	}

	// Sorting array in ascending order-->using sort method() from array class
	System.out.println("Sorted array in ascending order");
	Arrays.sort(a);
	for (int i : a)
	{
		System.out.print(i + " ");
	}

	// Sorting array in descending order
	System.out.println();
	System.out.println("Sorted array in descending order");
	for (int i = a.length - 1; i >= 0; i--)
	{
		System.out.print(a[i] + " ");
	}

}

}
