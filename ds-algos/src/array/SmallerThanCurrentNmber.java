/*
package array;

*/
/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

 

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
 *//*

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nu[] = { 8, 1, 2, 2, 3 };
		int nums[] = smallerNumbersThanCurrent2(nu);
		for (int i : nums) {
			System.out.println(i + " ");
		}
	}

//Solution 1
	static int[] smallerNumbersThanCurrent2(int[] nums) {
		int[] b = nums.clone();
		Arrays.sort(b);

		HashMap<Integer, Integer> uniques = new HashMap<Integer, Integer>();
		for (int i = 0; i < b.length; i++) {
			if (!uniques.containsKey(b[i])) {
				uniques.put(b[i], i);
			}
		}

		int[] smallerNums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			var value = uniques.get(nums[i]);
			smallerNums[i] = value;
		}
		return smallerNums;
	}

//Solution 2
	static int[] smallerNumbersThanCurrent(int[] nums) {

		int[] smaller = new int[101];

		for (int i = 0; i < nums.length; i++) {
			smaller[nums[i]]++;
		}

		for (int i = 1; i < 101; i++) {
			smaller[i] += smaller[i - 1];
		}

		for (int i = 0; i < nums.length; i++) {
			int position = nums[i];

			if (position == 0)
				nums[i] = 0;

			else {
				nums[i] = smaller[position - 1];
			}
		}

		return nums;
	}
}
*/
