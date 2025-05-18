package array;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 8, 5, 9, 19, 7 };
		int max = 0;
		int listCount = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> finallist = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			max = Integer.MIN_VALUE;
			for (int j = i; j < arr.length; j++) {

				if (max < arr[j]) {
					list.add(arr[j]);
					max = arr[j];
				}
			}
			if (listCount < list.size()) {
				finallist = new ArrayList<>(list);
				listCount = list.size();
			}
			list.clear();
		}

		for (Integer i : finallist) {
			System.out.println(i + " ");
		}
	}

}
