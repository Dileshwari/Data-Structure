package Dileshwari;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateValueinCyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 2, 6,5,5,4 };

		// find duplicate value in cyclic sort
		int k = CyclicSort(arr);
		System.out.println(k);

		// find All duplicate value in cyclic sort
		List<Integer> k1 = CyclicSort1(arr);
		System.out.println(k1);
	}

	private static int CyclicSort(int[] arr) {
		int i = 0;

		while (i < arr.length) {
			if (arr[i] != i + 1) {
				int swap = arr[i] - 1;

				if (arr[i] != arr[swap]) {
					int temp = arr[i];
					arr[i] = arr[swap];
					arr[swap] = temp;
				} else {

					return arr[i];
				}
			} else {

				i++;
			}

		}

		return -1;

	}

	private static List<Integer> CyclicSort1(int[] arr) {
		int i = 0;
		List<Integer> list = new ArrayList<>();
		while (i < arr.length) {

			int swap = arr[i] - 1;

			if (arr[i] != arr[swap]) {
				int temp = arr[i];
				arr[i] = arr[swap];
				arr[swap] = temp;
			} else {
				i++;
			}

		}

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != j + 1) {

				list.add(arr[j]);
			}
		}

		return list;

	}

}
