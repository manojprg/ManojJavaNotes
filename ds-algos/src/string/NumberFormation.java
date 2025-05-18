package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberFormation {

	public static void main(String[] args) {

		String[] numbers = { "99", "78", "8", "98", "77", "7", "8", "9", "0", "1" };

		Arrays.sort(numbers, new StringCompartor());
		Map<Character, Integer> map = new HashMap<>();
		for (String number : numbers) {

			if (map.containsKey(number)) {
				map.put(number.charAt(0), map.get(number.charAt(0)) + 1);
			} else {
				map.put(number.charAt(0), 1);
			}

		}

		String largestNumber = "";

		for (int i = numbers.length - 1; i >= 0; i--) {

			if (map.containsKey(numbers[i].charAt(0))) {
				int count = map.get(numbers[i].charAt(0));
				for (int j = 0; j < count; j++) {
					largestNumber = largestNumber + numbers[i].charAt(0);
				}
				map.remove(numbers[i].charAt(0));
			}

			largestNumber = largestNumber + numbers[i];
		}

		System.out.println("Largest number " + largestNumber);

	}

}
