package array;

public class BinaryN {

	static int setKthBit(int n, int k) {
		// kth bit of n is being set by this operation
		return ((1 << 4) | n);
	}

	// Driver code
	public static void main(String arg[]) {
		int n = 11, k = 15;
		System.out.print("Kth bit set number = " + setKthBit(n, k));
		
		
	}

}