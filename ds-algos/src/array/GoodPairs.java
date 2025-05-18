package array;

import java.util.HashMap;

/*
 * Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
public class GoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 2, 3, 1, 1, 3 };
		System.out.println(numIdenticalPairs(nums));
		System.out.println(numIdenticalPairs(nums));
	}

	static int numIdenticalPairs1(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int num : nums) {

			if (map.containsKey(num)) {
				sum += map.get(num) + 1;
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 0);
			}
		}

		return sum;

	}

	static int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> uniques = new HashMap<Integer, Integer>();

		for (int n : nums)
			uniques.put(n, uniques.containsKey(n) ? uniques.get(n) + 1 : 1);

		int sum = 0;
		for (int value : uniques.values())
			sum += (value * (value - 1)) / 2;

		return sum;
	}

}
