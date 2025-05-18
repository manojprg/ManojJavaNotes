package array;

public class FindPivotWhoseLeftElementAreSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 4, 3, 1, 5, 7, 5, 7, 11, 8, 12, 14 };

		int minRight[] = new int[arr.length];
		int maxLeft[] = new int[arr.length];

		maxLeft[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (maxLeft[i - 1] > arr[i]) {
				maxLeft[i] = maxLeft[i - 1];
			} else {
				maxLeft[i] = arr[i];
			}
		}

		minRight[arr.length - 1] = arr[arr.length - 1];
		for (int j = arr.length - 2; j > -1; j--) {

			if (minRight[j + 1] < arr[j]) {
				minRight[j] = minRight[j + 1];
			} else {
				minRight[j] = arr[j];
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (i != 0 && 1 != arr.length - 1 && maxLeft[i] == minRight[i]) {
				System.out.println("element is " + maxLeft[i]);
				// break;
			}
		}
	}

}
