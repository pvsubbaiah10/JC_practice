
public class Test {

	
	static int c=0;
	
	public static void main(String[] args) {
		
		String str="abc";
		
		per(str,"");
		System.out.println(c);


	}

	static void per(String str,String prefix) {
		if(str.length()==0) {
			System.out.println(prefix);
			c++;
		}else {
			for(int i=0;i<str.length();i++){
				String r=str.substring(0,i)+str.substring(i+1);
				per(r,prefix+str.charAt(i));
			}
		}
		
	}
	
	
}
