package array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "1", "2", "121", "9", "998" };

		Arrays.sort(arr, new Comparator<String>() {

			public int compare(String s1, String s2) {

				String s1s2 = s1 + s2;
				String s2s1 = s2 + s1;

				return s2s1.compareTo(s1s2);
			}
		});

		StringBuilder sb = new StringBuilder();

		for (String s : arr) {
			sb.append(s);
		}

		String largestNumber = sb.toString();
		System.out.println("Largest number " + largestNumber);

	}

}
