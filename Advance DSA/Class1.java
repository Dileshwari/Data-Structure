package Dileshwari;

import java.util.Arrays;
import java.util.stream.Stream;

public class Class1 {

	public static void main(String[] args) {
      char[] s= {'h','e','l','l','o'};
		 char[] rev=new char[s.length];
	        int k=0;
	        for(int i=s.length-1;i>=0;i--){

	        rev[k]=s[i];
	       k++;
	        }
		System.out.println(Arrays.toString(rev));
	}

}
