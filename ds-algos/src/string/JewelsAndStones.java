package string;

import java.util.HashMap;
import java.util.Map;

/**
 * . Jewels and Stones
 * 
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a
 * type of stone you have. You want to know how many of the stones you have are
 * also jewels.
 * 
 * Letters are case sensitive, so "a" is considered a different type of stone
 * from "A".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: jewels = "aA", stones = "aAAbbbb" Output: 3 Example 2:
 * 
 * Input: jewels = "z", stones = "ZZ" Output: 0
 * 
 * @author MANOJ SHARMA
 *
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}

	public static int numJewelsInStones(String jewels, String stones) {

		Map<Character, Integer> map = new HashMap<>();

		for (char c : stones.toCharArray()) {

			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		int sum = 0;
		for (char c : jewels.toCharArray()) {

			if (map.containsKey(c)) {
				sum += map.get(c);
			}

		}
		return sum;
	}
}
