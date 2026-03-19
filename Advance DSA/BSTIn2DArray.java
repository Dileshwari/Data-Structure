package Dileshwari;

import java.util.Arrays;

public class BSTIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] arr= {{3, 4}};
 
  int[] getIndewx=search(arr, 3);
  System.out.print(Arrays.toString(getIndewx));
	}

	private static int[] search(int[][] arr, int target) {
		int start=0;
		int end=arr[0].length-1;
		 
		while(start<arr.length && end>=0) {
			
			
			if(arr[start][end]==target) {
			
				return new int[] {start,end};
			} if(arr[start][end]<target) {
				
				start++;
			}else {
				
				end--;
			}
		}
		return new int[] {-1,-1};
	}

}
