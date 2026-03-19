package Dileshwari;

import java.util.Arrays;

public class MissingPositiveNumberCyclicSort {

	public static void main(String[] args) {
		int[] arr = {7,8,9,11,12};
		int k = CyclicSort(arr);
		System.out.println(k);

	}

	private static int CyclicSort(int[] arr) {

		
		int i=0;
		while(i<arr.length) {
			
			int swap=arr[i]-1;
			if (arr[i]>0 && arr[i]<arr.length && arr[i] != arr[swap]) {
				int temp = arr[i];
				arr[i] = arr[swap];
				arr[swap] = temp;
			} else {

				i++;
			}
		}
		
		for(int j=0;j<arr.length;j++) {
		 if(arr[j]!=j+1) {
			 return j+1;
			 
		 }
		}
		
		return arr.length;

	}

	
}
