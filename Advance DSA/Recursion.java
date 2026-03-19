package Dileshwari;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		recursion(n);
	}

	private static void recursion(int n) {
		if(n>5) {
	    	  
	    	  return ;
	      }
		if (n != 0) {

			System.out.println(n);
			recursion(n+1);
		}
	      

	}

}
