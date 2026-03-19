package Dileshwari;

import java.util.Arrays;

public class Setmismatchincyclicsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,4};

		int[] k = CyclicSort(arr);
		System.out.println(Arrays.toString(k));
	}

	private static int[] CyclicSort(int[] arr) {

		int i = 0;
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
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]!=j+1) {
				
				return new int[] {arr[j], j+1};
			}
		}
		return new int[] {-1,-1};
	}

}
