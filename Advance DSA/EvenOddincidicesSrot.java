package Dileshwari;

import java.util.Arrays;

public class EvenOddincidicesSrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 36, 45, 32, 31, 15, 41, 9 };
		int[] so = sortEvenOdd(arr);
		System.out.println(Arrays.toString(so));
	}

	public static int[] sortEvenOdd(int[] arr) {
		for (int i = 0; i < arr.length; i = i + 2) {
			for (int j = i + 2; j < arr.length; j = j + 2) {
				if (arr[i] >= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}
		
		for (int i = 1; i < arr.length; i = i + 2) {
			for (int j = i + 2; j < arr.length; j = j + 2) {
				if (arr[i] <= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}

		return arr;
	}
}
