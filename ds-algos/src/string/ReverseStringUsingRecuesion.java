package string;

public class ReverseStringUsingRecuesion {

	public static void main(String arg[]) {

		System.out.println(reverse("manoj"));
		System.out.println(reverse2("manoj"));
	}

	private static String reverse(String str) {

		if (str == null || str.length() == 0) {
			return str;
		}

		System.out.print(str.charAt(str.length() - 1));
		return reverse(str.substring(0, str.length() - 1));

	}

	private static String reverse2(String str) {

		if (str.isEmpty()) {
			return str;
		} else
			return reverse2(str.substring(1)) + str.charAt(0);

	}
}
