package array;

/**
 * Given an array of non-negative integers nums, you are initially positioned at
 * the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,3,1,1,4] Output: true Explanation: Jump 1 step from index 0
 * to 1, then 3 steps to the last index. Example 2:
 * 
 * Input: nums = [3,2,1,0,4] Output: false Explanation: You will always arrive
 * at index 3 no matter what. Its maximum jump length is 0, which makes it
 * impossible to reach the last index.
 *
 */
public class JumpToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 1,0, 1, 1,0,1 };
		System.out.println(canJump(arr));
	}

	public static boolean canJump(int[] nums) {
		int maxDis = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > maxDis)
				return false;
			maxDis = Math.max(maxDis, nums[i] + i);
		}
		return true;
	}
}
