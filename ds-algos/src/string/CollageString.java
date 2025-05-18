package string;

import java.util.HashMap;
import java.util.Map;

public class CollageString {

	public static void main(String[] args) {
		/*
		 * String s1 = "EveryDay is a wonderfull day"; String s2 = "day";
		 */
		
		String s1 = "We live in india and north india is fertile";
		String s2 = "in";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		Map<Character, Integer> countChar = new HashMap<>();
		Map<Character, Integer> countChar2 = new HashMap<>();
		char[] sch1 = s1.toCharArray();
		char[] sch2 = s2.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			char ch=sch1[i];
			if (countChar.containsKey(sch1[i])) {
				countChar.put(sch1[i], countChar.get(sch1[i])+1);
			} else {
				countChar.put(sch1[i], 1);
			}
		}

		for (int i = 0; i < s2.length(); i++) {

			if (countChar2.containsKey(sch2[i])) {
				countChar2.put(sch2[i], countChar2.get(sch2[i])+1);
			} else {
				countChar2.put(sch2[i], 1);
			}
		}

		int result = countChar.get(sch2[0]) / countChar2.get(sch2[0]);
		int min = 0;
		for (int i = 1; i < sch2.length; i++) {
			min = countChar.get(sch2[i]) / countChar2.get(sch2[i]);

			if (min < result) {
				result = min;
			}

			
		}
		System.out.println("Minimum " + result);
	}

}
