package array;

import java.util.Arrays;

public class ArrageArrayInPndelum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 2, 3, 5, 1, 6, 7 };
		Arrays.sort(arr);
		int arr2[] = new int[arr.length];
		int mid = (arr.length - 1) / 2;
		int left = mid, right = mid;
		;
		arr2[mid] = arr[0];
		int st = 1;
		while (left > 0 || right < arr.length - 1) {

			left = left - 1;
			right = right + 1;
			arr2[left] = arr[st];
			arr2[right] = arr[st + 1];
			st = st + 2;

		}

		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}

}
