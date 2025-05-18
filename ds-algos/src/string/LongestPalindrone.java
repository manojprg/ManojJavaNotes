package string;

public class LongestPalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abaabbaa";
		boolean arr[][] = new boolean[str.length()][str.length()];
		int st = 0;
		for (int i = 0; i < str.length(); i++) {
			arr[i][i] = true;
		}
		int maxLen = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				arr[i][i + 1] = true;
				st = i;
				maxLen = 2;
			}
		}

		for (int k = 3; k < str.length(); k++) {

			for (int i = 0; i < str.length() - k + 1; i++) {
				int j = i + k - 1;

				if (str.charAt(i) == str.charAt(j) && arr[i + 1][j - 1]) {
					arr[i][j] = true;

					if (k > maxLen) {
						st = i;
						maxLen = k;
					}
				}
			}
		}
		System.out.println("start index=" + st + " end index=" + (st + maxLen - 1));
	}
}
