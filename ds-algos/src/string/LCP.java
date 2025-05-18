package string;

public class LCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]=new String[3];
		a[0]="abcde";
		a[1]="abcde";
		a[2]="abcde";
		
		System.out.println(findLCP(a));
		//System.out.println("ab");
	}

	static String findLCP(String str[]) {

		String lcp = "";
		int index=0;
		for (int i = 0; i < str[0].length(); i++) {
			char ch = str[0].charAt(index);
			for (int j = 0; j < str.length; j++) {

				if (i < str[j].length() && ch != str[j].charAt(index)) {
					return lcp;
				}

			}
			lcp = lcp + ch;
			index++;

		}
		return lcp;

	}

}
