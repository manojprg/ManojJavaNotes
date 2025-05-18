package string;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {

		String str = "abcd";
		reverse(str);
	}

	static void reverse(String str) {

		if (str == null || str.length() == 0) {
			return;
		}
		System.out.println(str.charAt(str.length() - 1));
		reverse(str.substring(0, str.length() - 1));
	}

}
