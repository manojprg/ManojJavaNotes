package array;

/**
 * 1480. Running Sum of 1d Array
 * 
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]…nums[i]).
 * 
 * Return the running sum of nums.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is
 * obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * @author MANOJ SHARMA
 *
 */
public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 2, 3, 4 };
		nums = runningSum2(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static int[] runningSum(int[] nums) {
		int sum = 0;
		int arr[] = new int[nums.length];
		int count = 0;
		for (int i : nums) {
			sum += i;
			arr[count++] = sum;
		}
		return arr;
	}

	public static int[] runningSum2(int[] nums) {

		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
		return nums;
	}
}
