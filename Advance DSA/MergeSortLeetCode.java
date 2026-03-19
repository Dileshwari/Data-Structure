package Dileshwari;

import java.util.Arrays;

public class MergeSortLeetCode {

	public static void main(String[] args) {

		int m = 3;
		int n = 3;
		int[] left = { 1, 2, 3, 0, 0, 0 };
		int[] right = { 2, 5, 6 };
		merge(left, right, m, n);

	}

	private static void merge(int[] left, int[] right, int m, int n) {

		int[] mix = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m && j < n) {

			if (left[i] <= right[j]) {

				mix[k] = left[i];
				i++;
			} else {

				mix[k] = right[j];
				j++;

			}
			k++;

		}

		while (i < m) {
			mix[k] = left[i];
			i++;
			k++;
		}
		while (j < n) {
			mix[k] = right[j];
			j++;
			k++;
		}

		for (int x = 0; x < m + n; x++) {
			left[x] = mix[x];
		}

		System.out.println(Arrays.toString(mix));
	}

}
