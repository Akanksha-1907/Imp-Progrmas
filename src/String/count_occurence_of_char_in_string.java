package String;

public class count_occurence_of_char_in_string
{
	public static void main(String[] args)
	{

		String s = "welcome to the world of dreams";
		int count = s.length() - s.replace("e", "").length();
		System.out.println("Number of occurence of character e is- " + count);

	}
}