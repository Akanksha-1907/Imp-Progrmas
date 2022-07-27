package String;


import java.util.HashMap;
import java.util.Set;

public class count_duplicate_string {
	public static void main(String[] args) {
		String[] s = {"ashu","keechu","heer","jiva","ashu","ashu","heer","meera","heer","meera"};
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (String s1 : s)
			if (hmap.containsKey(s1))

				hmap.put(s1, hmap.get(s1) + 1);

			else

				hmap.put(s1, 1);

		Set<String> key = hmap.keySet();
		for (String ch : key)

			if (hmap.get(ch) > 1)

				System.out.println(ch + " " + hmap.get(ch));

	}

}
