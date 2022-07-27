package Programs;

import java.util.HashMap;
import java.util.Map;

public class hashmap_count_character_print
{
	public static void main(String[] args) 
	{
			String s="malayalam";
			char c[]=s.toCharArray();
			Map<Character,Integer> count=new HashMap<>();
			for(char i:c) {
				if(count.containsKey(i))
				{
					count.put(i, count.get(i)+1);
					
				}
				else
					count.put(i, 1);
				
			}
			System.out.println(count);
			
			}
		
	}


