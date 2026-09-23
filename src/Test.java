
public class Test {

	public static void main(String[] args) {

		
		String s = "abcabcbb";
		
		String c="";
		int m=0;
		String l="";
		
		
		for(char ch:s.toCharArray()) {
			if(c.indexOf(ch)!=-1) {
				c=c.substring(c.indexOf(ch)+1);
			}
			
			c+=ch;
			m=Math.max(m, c.length());
			if(c.length()>l.length()) {
				l=c;
			}
		}
		

		
		System.out.println(m);
		System.out.println(l);
	}	

}
