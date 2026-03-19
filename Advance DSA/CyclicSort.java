package Dileshwari;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,1,3,2,4,0};
		
		CyclicSort1(arr);
		System.out.println(Arrays.toString(arr));
	}

	

	
	
	private static void CyclicSort1(int[] arr) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<arr.length;i++) {
			
			int swap=arr[k];
			if(arr[k] !=k) {
				
				int temp=arr[k];
				arr[k]=arr[swap];
				arr[swap]=temp;
			}else {
				
				k++;
			}
					
		}
	}

}
