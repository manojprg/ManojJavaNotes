package string;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String str = "abcdba";
		boolean flg = false;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {

					flg = true;
					break;
				}
			}
			if (true) {
				System.out.println("first repeated character " + str.charAt(i));
				break;
			}
		}
		String s = "abcdfgh";

	}

}
