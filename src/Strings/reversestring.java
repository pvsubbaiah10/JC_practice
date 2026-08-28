package Strings;

public class reversestring {

	public static void main(String[] args) {
		
		
		String s = "Hello";
		
		// using StringBuilder
		/*
		 * StringBuilder sb = new StringBuilder(s) ;
		 * 
		 * String reversed = sb.reverse().toString();
		 * 
		 * System.out.println(reversed);
		 * 
		 */
		    
		    
		    // using charAt method
		    
/*		    String rev ="";
		    
		    char ch;
		    
		    for(int i=0;i<s.length();i++) {
		    	ch = s.charAt(i);
		    	rev =ch+rev;
		    }
              System.out.println(rev);
	  */
	
	
	//  // using toCharArray method
	
	
	        char[] c = s.toCharArray();
	        
	        for(int i=c.length-1;i>=0;i--) {
	        	System.out.print(c[i]);
	        }
	}
}
