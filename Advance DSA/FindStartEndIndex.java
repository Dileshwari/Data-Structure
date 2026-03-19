package Dileshwari;

import java.util.Arrays;

public class FindStartEndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7,8,9,10};
		//int[] arr = {};
		System.out.println(Arrays.toString(search(arr, 2)));

	}

	private static int[] search(int[] arr, int target) {
		int[] ans = { -1, -1 };
		int start = firstlast(arr, target, true);
		int end = firstlast(arr, target, false);
		ans[0]=start;
		ans[1]=end;
		return ans;
	}

	private static int firstlast(int[] arr, int target,boolean f) {

		int start = 0;
		int end = arr.length - 1;
		if (arr.length == 0) {

			return -1;
		}
		int ans = -1;
		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] < target) {
				// end=mid-1;
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
				// start=mid+1;

			} else {

				ans = mid;
				if (f) {

					end = mid - 1;
				} else {

					start = mid + 1;
				}

			}
		}
		return ans;

	}
}