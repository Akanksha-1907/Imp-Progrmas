package Programs;

import java.util.Arrays;

public class maximum_diff_between_no_array 
{

	public static void main(String[] args) 
	{
		int[]a= {10,20,30,2,59,80};
		Arrays.sort(a);
		for(int b:a)
		{
			System.out.println(b);
		}
		int x=a[0];
		int y=a[a.length-1];
		System.out.println(y-x);
		
	}
}
