package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdba";
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (Character ch : set) {
			sb.append(ch);
		}
		String st = new String(sb);
		System.out.println("Removed duplicate=" + st);
	}

}
