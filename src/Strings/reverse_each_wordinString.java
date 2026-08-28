package Strings;

public class reverse_each_wordinString {

	public static void main(String[] args) {
		
		String w = "Java is good programming langauges";
		
/*		
		// using StringBuilder 
		
		String[] word=w.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String words : word) {
			
			StringBuilder rev = new StringBuilder(words);
			rev.reverse();
			result.append(rev);
			result.append(" ");
		}
         System.out.println(result.toString().trim());
         */
         
         // normal method
         
         String[] words=w.split(" ");
         
         String revresult="";
         
         for(int i=0;i<words.length;i++) {
        	      
        	    String word= words[i];
        	    
        	    String rev="" ;
        	    
        	    for(int j=0;j<word.length();j++) {
        	    	char c=word.charAt(j);
        	    	rev= c+rev;
        	    }
        	    revresult = revresult+rev+" "; 
         }
          System.out.println(revresult);
	}

}
