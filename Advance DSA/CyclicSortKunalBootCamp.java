package Dileshwari;

import java.util.Arrays;

public class CyclicSortKunalBootCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 0,1, 3, 2, 4};
		
		CyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void CyclicSort(int[] arr) {
	
		int i=0;
		while(i<arr.length) {
			
			int swap=arr[i];
			
			if(arr[i] !=arr[swap]) {
				int temp=arr[i];
				arr[i]=arr[swap];
				arr[swap]=temp;
			}else {
				
				i++;
			}
				
			
		}
		
	}

}
