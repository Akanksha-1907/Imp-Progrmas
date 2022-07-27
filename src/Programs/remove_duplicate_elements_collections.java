package Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class remove_duplicate_elements_collections 
{
	public static void main(String[]args)
	{
	int[]a={45,25,63,15,20,78,54,63,03,19,03,19};
	ArrayList<Integer>b=new ArrayList<Integer>();
	for(int i=0;i<=a.length-1;i++)
	{
		b.add(a[i]);
	}
	System.out.println(b);
	LinkedHashSet<Integer>lh=new LinkedHashSet<Integer>(b);
	System.out.println(lh);
	}
}
