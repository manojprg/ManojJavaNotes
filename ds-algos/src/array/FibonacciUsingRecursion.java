package array;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		int s = 1;
		System.out.print(f + " " + s);
		fibonacci(f, s, 2);

	}

	static void fibonacci(int f, int s, int count) {

		if (count == 10) {
			return;
		}
		System.out.print(" " + (f + s));
		fibonacci(s, (f + s), ++count);

	}

}
