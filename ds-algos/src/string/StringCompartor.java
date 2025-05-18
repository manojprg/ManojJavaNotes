package string;

import java.util.Comparator;

public class StringCompartor implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int num1 = Integer.parseInt(o1);
		int num2 = Integer.parseInt(o2);

		if (num1 > num2) {
			return 1;
		}
		if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}

	}

}
