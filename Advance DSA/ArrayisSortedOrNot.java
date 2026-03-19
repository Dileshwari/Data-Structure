package Dileshwari;

public class ArrayisSortedOrNot {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 7, 9, 80, 600 ,900,1000};

		System.out.print(sortedornot(arr));

	}

	private static String sortedornot(int[] arr) {
		boolean swap = false;
		for (int i = 0; i < arr.length-1; i++) {

			if (arr[i] > arr[i + 1]) {

				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				swap = true;
			}
		}
		return swap==false? "Sorted":"Not sorted";

	}

}
