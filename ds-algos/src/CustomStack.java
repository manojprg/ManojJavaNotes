import java.util.function.BiPredicate;

public class CustomStack {

	private int arr[];
	private int index = 0;
	private int size;
BiPredicate p;
	public CustomStack(int size) {

		this.size = size;
		arr = new int[size];
	}

	public void push(int data) {

		if (arr.length == size) {
			throw new StackOverflowError();
		} else {
			arr[index] = data;
			index++;
		}
	}
}
