package string;

public class AddNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="12zx3nm<>45";
		String s="";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				s=s+str.charAt(i);
			}else if(s.length()!=0){
				int n=Integer.parseInt(s);
				sum=sum+n;
				s="";
			}
		}
		if(s.length()!=0) {
			int n=Integer.parseInt(s);
			sum=sum+n;
			
		}
		System.out.println("sum="+sum);
	}

}
