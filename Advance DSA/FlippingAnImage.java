package Dileshwari;

import java.util.Arrays;

public class FlippingAnImage {

	public static void main(String[] args) {
		
		int[][] numb = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		for (int[] i:  numb) {
		
			for (int j = 0; j < (numb[0].length+1)/2; j++) {
                
			
				int temp= i[j] ^ 1;
				
				i[j]=i[numb[0].length-j-1] ^1;
				i[numb[0].length-j-1] = temp;
				System.out.print(temp+" ");
				
			}
			System.out.println(numb);
		}

		
	}

}
