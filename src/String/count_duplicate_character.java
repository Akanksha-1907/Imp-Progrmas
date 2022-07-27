package String;

import java.util.HashMap;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class count_duplicate_character 
{
	public static void main(String[] args) {
		
	String s="hfgdsjfjsygduyacstduyst";
	char[]c=s.toCharArray();
	HashMap<Character,Integer>hmap=new HashMap<Character,Integer>();
	
	for(char s1:c)
		if(hmap.containsKey(s1))
			hmap.put(s1, hmap.get(s1)+1);
		else
			hmap.put(s1, 1);
		
	Set<Character>key=hmap.keySet();
	for(char ch:key)
		if(hmap.get(ch)>1)
			System.out.println(ch+" "+hmap.get(ch));
		
	}
}



