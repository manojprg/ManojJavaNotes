package array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 3, 5, 1, 2, 8, 6, 7 };
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
