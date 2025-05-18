package array;

import java.util.Arrays;

public class ClosestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { -1, 2, 1, -4 };
		int diff = 0;
		int min = Integer.MAX_VALUE;
		int target = 1;
		boolean flag = Boolean.FALSE;
		int previousSum = 0;
		int sum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {

				sum = arr[i] + arr[j] + arr[k];
				diff = Math.abs(target - sum);

				if (diff == 0) {
					flag = Boolean.TRUE;
					break;
				}
				if (diff < min) {
					previousSum = sum;
					min = diff;
				}
				if (sum < target) {
					j++;
				} else {
					k--;
				}
			}
			if (flag == true) {
				break;
			}
		}

		System.out.println("sum = " + previousSum);
	}

}
