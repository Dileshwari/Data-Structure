package Dileshwari;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 34, 24, 12, 32, 90, 1, 3, 6, 2 };
		boolean swap = false;
		for (int i = 0; i < arr.length; i++) {
			swap = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swap = true;

				}
			}
			if (swap == false) {

				break;
			}
		}
		System.out.print(Arrays.toString(arr));
	}

}
