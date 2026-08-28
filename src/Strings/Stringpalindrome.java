package Strings;

public class Stringpalindrome {

	public static void main(String[] args) {
		
		String a = "madam";

		String rev="";
		
		char ch;
		
		for(int i=0;i<a.length();i++) {
			
			ch=a.charAt(i);
			rev=ch+rev;
					
		}

		System.out.println(rev);
		
		if(rev.equals(a)) {
			System.out.println("p");
		}else {
			System.out.println("np");
		}
		
	}

}
