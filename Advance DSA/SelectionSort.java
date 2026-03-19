package Dileshwari;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 34, 24, 12, 32, 00, 1, 3, 6, 2 };

		selectionsort(arr);
		System.out.print(Arrays.toString(arr));
	}

	private static void selectionsort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int max = getMaxElement(arr, 0, last);
			System.out.println(max);
			swap1(arr,max, last);

		}

	}

	private static void swap1(int[] arr, int max, int last) {
		// TODO Auto-generated method stub
		int temp = arr[max];
		arr[max] = arr[last];
		arr[last] = temp;
	}

	private static int getMaxElement(int[] arr, int start, int last) {
		int max = start;
		for (int i = 0; i < last; i++) {
			if (arr[i] > arr[max]) {

				max = i;
			}

		}
		return max;

	}

}
