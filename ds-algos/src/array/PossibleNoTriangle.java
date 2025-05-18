package array;

import java.util.Arrays;

public class PossibleNoTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,4};
		Arrays.sort(arr);

		int count = 0;
		int size = arr.length;

		for (int i = size - 1; i >= 1; i--) {
			int lt = 0;
			int rt = i - 1;
			while (lt < rt) {
				if ((arr[lt] + arr[rt]) > arr[i]) {
					count = count + rt - lt;
					rt--;
				} else {
					lt++;
				}
			}
		}
		System.out.print("count =" + count);

	}

}
