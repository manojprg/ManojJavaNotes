package array;

public class NoOfFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "0001010111";
		int countWith0 = countFlip(str, '0');
		int countWith1 = countFlip(str, '1');
		System.out.println(Math.min(countWith0, countWith1));
	}

	static int countFlip(String s, char ch) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ch) {
				count++;
			}
			if (ch == '0') {
				ch = '1';
			} else {
				ch = '0';
			}

		}
		return count;
	}

}
