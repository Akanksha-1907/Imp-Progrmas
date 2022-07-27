package String;

public class cccccccc 
{
	public static void main(String[] args) 
	{
		int NumberToCheck = 371;
		int temp = NumberToCheck;
		int reminder=0;
		int result=0;
		
		while (temp != 0) {
			reminder = temp % 10;   //1; 7; 3:(to remove reminder we use %)
			result = result +(reminder*reminder*reminder); 
			//1; 343; 27:
			temp = temp/10; //37; 3; (to remove quotient we use /)
		}
		if(result==NumberToCheck)
            System.out.println("Given Number "+NumberToCheck+" is an Armstrong Number");
		else
			System.out.println("Given Number "+NumberToCheck+" is NOT an Armstrong Number");

		
	}

}
