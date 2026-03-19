package Dileshwari;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 34, 24, 12, 32, 00, 1, 3, 6, 2 };
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionsort(int[] arr) {
		int start=0;
		for(int i=0;i<arr.length;i++) {
		int end=arr.length-i-1;
		int max=getmax(arr, 0, end);
		swap(arr, max, end);
		
	}

}

	private static void swap(int[] arr, int max, int end) {
		// TODO Auto-generated method stub
		int temp=arr[max];
		arr[max]=arr[end];
		arr[end]=temp;
	}

	private static int getmax(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int max=start;
		for(int i=0;i<end;i++) {
			if(arr[i]>arr[max]) {
				
				max=i;
			}
		}
		
		return max;
	}
}
