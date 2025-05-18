package array;

import java.util.Arrays;

public class KthElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 2, 4, 5, 6, 8, 7 };
		int k = 4;
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
	}

}
