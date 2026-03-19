package Dileshwari;

import java.util.Arrays;

public class InPmaceMergeSort {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 4, 12, 5, 6 };

		mergesortA(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergesortA(int[] arr, int start, int end) {

		if (end-start <2) {

			return;
		}
		int mid = (start + end) / 2;
		mergesortA(arr, start, mid);
		mergesortA(arr, mid+1, arr.length);
		merge(arr, start, mid, end);
	}

	
	 private static void merge(int[] arr, int start, int mid, int end) {
	        int[] mix = new int[end - start];
	        int i = start;
	        int j = mid;
	        int k = 0;

	        // Merge the two halves into the temporary array
	        while (i < mid && j < end) {
	            if (arr[i] <= arr[j]) {
	                mix[k++] = arr[i++];
	            } else {
	                mix[k++] = arr[j++];
	            }
	        }

	        // Copy the remaining elements of the left half, if any
	        while (i < mid) {
	            mix[k++] = arr[i++];
	        }

	        // Copy the remaining elements of the right half, if any
	        while (j < end) {
	            mix[k++] = arr[j++];
	        }

	        // Copy the sorted elements back into the original array
	        System.arraycopy(mix, 0, arr, start, mix.length);
	    }

}
