package Programs;

import java.util.Scanner;

public class find_number_of_digits_in_number
{
	public static void main(String[] args) 
	{
		int num;
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number- ");
		num=sc.nextInt();
		if(num<0)
		{
			num=num*-1;
		}
		else if(num==0)
		{
			num=1;
		}
		while(num>0)
		{
			num=num/10;
			a++;
		}
		System.out.println("Number of digits in given number is- "+a);				
		
	}

}
