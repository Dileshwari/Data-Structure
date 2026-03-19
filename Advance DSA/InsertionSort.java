package Dileshwari;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Insertionsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void Insertionsort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					
					// TODO Auto-generated method stub
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}else {
					
					
					System.out.println("hh");
					break;
				}
				
				
			}
		}
	}

}
