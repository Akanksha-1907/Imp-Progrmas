package String;

import java.util.HashMap;

public class count_duplicate_character1 
{
	public static void main(String[] args) 
	{
		String s="malayalam";
		int count=0;
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>=2)
			{
				map.put(s.charAt(i), count);
			}
		}
		System.out.println(map);
	}

}
