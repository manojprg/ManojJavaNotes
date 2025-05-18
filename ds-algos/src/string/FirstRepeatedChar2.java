package string;

public final class FirstRepeatedChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aAbcdbAa";
		int max = 256;
		int[] identifiedChar = new int[max];
		int[] position = new int[max];
		int firstVal = -1;
		for (int i = 0; i < str.length(); i++) {
			int ascii = (int) str.charAt(i);

			if (identifiedChar[ascii] == 0) {
				identifiedChar[ascii]++;
				position[ascii] = i;
			} else if (identifiedChar[ascii] > 0) {
				identifiedChar[ascii]++;
			}

		}

		for (int i = 0; i < max; i++) {

			if (identifiedChar[i] > 1) {
				if (firstVal == -1) {
					firstVal = position[i];
				}
				if (firstVal > position[i]) {
					firstVal = position[i];
				}
			}

		}
		System.out.println("Repeated char pos=" + firstVal);
		System.out.println("Repeated char=" + str.charAt(firstVal));
	}

}
