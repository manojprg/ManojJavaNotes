package array;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int temp[] = arr.clone();

		int n = arr.length;
		int st = 0, ed = n - 1;

		boolean fl = true;

		for (int i = 0; i < n; i++) {
			if (fl)
				arr[i] = temp[ed--];
			else
				arr[i] = temp[st++];

			fl = !fl;
		}

		for (int i : arr)
			System.out.print(i + " ");
	}

}
