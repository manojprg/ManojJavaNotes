package array;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 3, 5, 1, 2, 8, 6, 7 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
