package Dileshwari;

public class PelindromeString {

	public static void main(String[] args) {
		String s="";
		char[] ch=s.toCharArray();
	   
		System.out.println(pelindrome(ch));
		
		
	}

	private static boolean pelindrome(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]==ch[ch.length-i-1])) {
				return false;
				
			}
			
		}
		return true;
	}

}
