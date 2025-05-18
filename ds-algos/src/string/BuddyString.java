package string;

/*
 * Buddy Strings

Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
Example 2:

Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
Example 3:

Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
Example 4:

Input: s = "aaaaaaabc", goal = "aaaaaaacb"
Output: true
 
 */
import java.util.HashSet;
import java.util.Set;

class BuddyString {
	public static void main(String[] args) {
		System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
		System.out.println(buddyStrings("aa", "ab"));
	}

	public static boolean buddyStrings(String s, String goal) {

		int k = -1;
		int j = -1;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != goal.charAt(i)) {
				if (k == -1) {

					k = i;
				} else {

					j = i;
				}
				count++;

			}
		}
		boolean dup = false;
		Set<Character> aset = new HashSet<Character>();
		for (char c : s.toCharArray()) {
			if (aset.contains(c)) {
				dup = true;
				break;
			}
			aset.add(c);
		}
		if (s.equals(goal)) {
			if (dup == true)
				return true;
			else
				return false;
		}
		if (count == 2) {
			char ch[] = s.toCharArray();
			char temp = ch[k];
			ch[k] = ch[j];
			ch[j] = temp;
			String s2 = new String(ch);
			if (s2.equals(goal)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}