package String;

import java.util.Arrays;

public class Sort_character_in_string
{
	public static void main(String[] args) 
	{

		String[] s = { "A", "k", "a", "n", "k", "s", "h", "a" };
		Arrays.sort(s);
		for (int i = 0; i <= s.length - 1; i++)
		{
			System.out.print(s[i]);
		}
	}

}
