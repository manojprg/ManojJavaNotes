package string;

public class ReadNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcd23bc><?";
		String number = "";
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				number += str.charAt(i);
			}

		}
		System.out.println("Number=" + number);
	}

}
