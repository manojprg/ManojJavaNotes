package string;

/**
 * Defanging an IP Address
 * 
 * Given a valid (IPv4) IP address, return a defanged version of that IP
 * address.
 * 
 * A defanged IP address replaces every period "." with "[.]".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1" Example 2:
 * 
 * Input: address = "255.100.50.0" Output: "255[.]100[.]50[.]0"
 * 
 * @author MANOJ SHARMA
 *
 */
public class DefangIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(defangIPaddr("255.100.50.0"));
	}

	public static String defangIPaddr(String address) {
		StringBuilder sb = new StringBuilder();
		for (char c : address.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(c);
			} else {
				sb.append("[.]");
			}
		}
		return new String(sb);
	}
}
