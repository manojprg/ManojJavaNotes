package array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {

			if (j > i) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		for (int i : arr) {

			System.out.print(i + " ");
		}
	}

}
