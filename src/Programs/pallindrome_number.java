package Programs;

public class pallindrome_number 
{
		public static void pallindrome(int num)
		{
			System.out.println("Given number is- "+num);
			int r=0;
			int sum=0;
			int t;
			t=num;
			
			while(num>0)
			{
				r=num%10;			//get the remainder
				sum=(sum*10)+r;
				num=num/10;
			}
			if(t==sum)
			{
				System.out.println("Pallindrome Number");
			}
				
			else
			{
				System.out.println("Not Pallindrome Number");
			}
		}

		public static void main(String[] args)
		{
			pallindrome(22);
			
		}
	}



