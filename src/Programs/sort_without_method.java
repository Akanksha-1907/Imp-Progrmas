package Programs;

public class sort_without_method
{
	public static void main(String[] args)
	{
		int[]a= {10,58,65,47,15,63,75,89,63,42};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];      //count=a[i];   				               
					a[j]=a[i]-a[j];      //a[i]=a[j];    	
					a[i]=a[i]-a[j];	     //a[j]=count;   	
				}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
