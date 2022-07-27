package String;

public class To_print_initials_of_words_from_string 
{
	public static void main(String[] args) 
	{
		//Java program to input name, middle name and surname of a person and print only the initials.
		
		String s="Sachin Ramesh Tendulkar";
		String s1=s.substring(0,1)+" "+s.substring(7,8)+" "+s.substring(14,15);
		System.out.println(s1);
		
	}

}
