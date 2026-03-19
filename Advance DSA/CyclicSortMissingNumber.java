package Dileshwari;

import java.util.Arrays;

public class CyclicSortMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,0,1};
		int k=CyclicSort(arr);
		System.out.println(k);
	}

	private static int CyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			
			int swap=arr[i];
			
			if(arr[i]<arr.length && arr[i] !=arr[swap]) {
				int temp=arr[i];
				arr[i]=arr[swap];
				arr[swap]=temp;
			}else {
				
				i++;
			}
				
			
		}
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]!=j) {
				
				return j;
			}
		}
		return arr.length;
	}

}
