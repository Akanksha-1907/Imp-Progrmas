package String;


public class remove_vowels_from_string
{
	public static void main(String[] args)
	{
		String s="cats hate water";
		String s1=s.replaceAll("[aeiouAEIOU]", "");
		System.out.println("After removing the vowels :- "+s1);
		
	}

}
