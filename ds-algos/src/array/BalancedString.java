package array;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "LRLLRRLRRL".toUpperCase();
		int lCount = 0;
		int rCount = 0;
		int partitionCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('L' == c) {
				++lCount;
			} else {
				++rCount;
			}
			if (lCount == rCount) {
				++partitionCount;
			}
		}

		System.out.println("count = " + partitionCount);
	}

}
