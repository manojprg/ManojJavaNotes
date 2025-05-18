package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWithoutRecurison("abcd"));
		System.out.println(reverseWithoutRecurison("abc"));
		System.out.println(reverseWithoutRecurison(""));

		System.out.println();
		System.out.println(reverseWithRecurison("xyza"));
		System.out.println(reverseWithRecurison("xyz"));
		System.out.println(reverseWithRecurison(""));

	}

	private static String reverseWithoutRecurison(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0, j = ch.length - 1; i < j; j--, i++) {

			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
		}

		return new String(ch);
	}

	private static String reverseWithRecurison(String str) {

		if (str == null || str.length() == 0) {
			return "";
		}
		// System.out.print(str.charAt(str.length() - 1));
		return reverseWithRecurison(str.substring(1)) + str.charAt(0);
	}

}
