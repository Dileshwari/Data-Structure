package Dileshwari;

import java.util.Arrays;

public class PeakIndexmoutainArray {

	public static void main(String[] args) {
		int[] arr = {24,69,100,99,79,78,67,36,26,19};

		System.out.println(search(arr));
	}

	private static int search(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		if (arr.length == 0) {

			return -1;
		}

		while (start < end) {
			int mid = (start + end) / 2;
            if(arr[mid]<arr[mid+1]) {
            	
            	
            	start=mid+1;
            }
            else {
            	
            	
            	end=mid;
            }
            
		}
		return start;
	}

}
