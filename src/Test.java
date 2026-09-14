
public class Test {

	public static void main(String[] args) {

		String str = "Java is easy";
		
		String rev[]=str.split(" ");


         for(String word : rev) {
        	 String rev1="";

          for(int i=word.length()-1;i>=0;i--) {
         	 rev1=rev1+word.charAt(i);

          }
		
		System.out.print(rev1+" ");
	}
	}

}
