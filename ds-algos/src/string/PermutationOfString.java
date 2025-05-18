package string;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		permutationOfString(str, 0, str.length() - 1);
	}

	static void permutationOfString(String str, int st, int end) {

		if (st == end) {
			System.out.println(str);
		} else {
			for (int i = st; i <= end; i++) {
				str = swapChar(str, st, i);
				permutationOfString(str, st + 1, end);
				str = swapChar(str, st, i);
			}
		}
	}

	static String swapChar(String str, int first, int sec) {
		char c;
		char[] cha = str.toCharArray();
		c = cha[first];
		cha[first] = cha[sec];
		cha[sec] = c;

		return new String(cha);
	}

}
