package Programs;

public class bbbbbbbbbbbbbb
{
	
	public static void main(String[]args)
	{
		int cube=0;    //int gnum=371
		int r=0;		//int temp=gnum
		int t=0;		//int rem=0
		int num=371;   //int result=0
		t=num;
		while(num>0)
		{
		r=num%10;     //1    rem=temp%10
		num=num/10;    //37   result=resut+(rem*rem*rem)
		cube=cube+(r*r*r); //temp=temp/10
		}
		if(t==cube)      //if(result==gnum)
		{
		System.out.println("It is a Armstrong Number");
		}
		else
		{
		System.out.println("It is not a Armstrong Number");
		}
		}
	}




