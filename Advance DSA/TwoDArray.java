package Dileshwari;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] t = {{2,3,34},{3,6,7},{1,9,0, -1},{1,2,4,5,600}};
     
     
     int min=Integer.MAX_VALUE;
     int mi=hdhhhf(t, min);
     System.out.println(mi);
     
	}

	private static int hdhhhf(int[][] t, int min) {
		// TODO Auto-generated method stub
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[i].length;j++) {
				
				
				if(min>t[i][j]) {
					
					min=t[i][j];
				}
			}
			
			
			
		}
		
		return min;
	}

}

