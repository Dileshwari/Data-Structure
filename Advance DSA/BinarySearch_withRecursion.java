package Dileshwari;

public class BinarySearch_withRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };
		System.out.println(search(arr, 9));
	}
		public static int search(int[] nums, int target) {
	        int start=0;
	        int end=nums.length-1;
	         int k= BSTWithRecusrion(nums, target, start, end);
	         return k;
	    }

	    private static int BSTWithRecusrion(int[] arr, int target, int start, int end) {

			int mid = (start + end) / 2;
			if (arr[mid] == target)

				return mid;
			 if (arr[mid] < target){
	          return BSTWithRecusrion(arr, target, mid + 1, end);
	         }

			return BSTWithRecusrion(arr, target, start, mid - 1);
		}
}
