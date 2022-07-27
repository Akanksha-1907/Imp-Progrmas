package Programs;

public class find_missing_number_from_array 
{
	//Missing number from array
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5};
		int l=a.length+1;
		int sum=(l*(l+1))/2;
		int mis=0;
		for(int i=0;i<=a.length-1;i++)
		{
			mis=mis+a[i];
		}
		System.out.println(sum-mis);
	}

}
