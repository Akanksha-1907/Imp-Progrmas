package String;

public class first_last_word_upper_of_string 
{

	public static void main(String[] args) 
	{
		 String s="i am an automation tester";
		 
		 System.out.print(s.toUpperCase().charAt(0)+" ");
		 System.out.print(s.toUpperCase().charAt(2));
		 System.out.print(s.toUpperCase().charAt(3)+" ");
		 System.out.print(s.toUpperCase().charAt(5));
		 System.out.print(s.toUpperCase().charAt(6)+" ");
		 
		 System.out.print(s.toUpperCase().charAt(8)+""+s.substring(9,17));
		 System.out.print(s.toUpperCase().charAt(17)+" ");
		 System.out.print(s.toUpperCase().charAt(19)+""+s.substring(20,23));
		 System.out.print(s.toUpperCase().charAt(24));
		 
		
	}

}
