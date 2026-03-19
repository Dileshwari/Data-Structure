package Dileshwari;

public class CeilingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {300,200,100,40,30,20,10,5};
		int[] arr= {2,4,5,6,7,8,9,70,80,90};
		int target = 35;
		int c = ceilingNumberinAsc(arr, target);
		System.out.println(c);
		
		
		int c1 = FloorumberinAsc(arr, target);
		System.out.println(c1);
		
		
		int[] arr1= {90,50,40,30,20,10,5,0};
		int target1 = 35;
		int f = ceilumberindesc(arr1, target1);
		System.out.println(f);
		int f1 = Floorumberindesc(arr1, target1);
		System.out.println(f1);
		
		
	}

	
	private static int ceilumberindesc(int[] arr, int target1) {
		int start = 0;
		int end = arr.length - 1;

		if (target1 > arr[0] || target1 < arr[arr.length - 1] || arr.length == 0) {
			return -1;
		}
		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target1) {
				return arr[mid];
			
			} else if (arr[mid] < target1) {
				
				end = mid - 1;
			} else {
				
				start = mid + 1;
			}
		}
		return arr[end+1];
	
	}


	private static int Floorumberindesc(int[] arr, int target1) {
		int start = 0;
		int end = arr.length - 1;

		if (target1 > arr[0] || target1 < arr[arr.length - 1] || arr.length == 0) {

			return -1;
		}
		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target1) {
				return arr[mid];
			} else if (arr[mid] < target1) {
				//start = mid + 1;
				end = mid - 1;
			} else {
				//end = mid - 1;
				start = mid + 1;
			}
		}
		return arr[end];
	}


	private static int FloorumberinAsc(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		if (target < arr[0] || target > arr[arr.length - 1] || arr.length == 0) {

			return -1;
		}
		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return arr[mid];
			} else if (arr[mid] < target) {
				start = mid + 1;
				//end = mid - 1;
			} else {
				end = mid - 1;
				//start = mid + 1;
			}
		}
		return arr[start-1];
	}


	private static int ceilingNumberinAsc(int[] arr, int target) {
		// TODO Auto-generated method stub

		int start = 0;
		int end = arr.length - 1;

		if (target < arr[0] || target > arr[arr.length - 1] || arr.length == 0) {

			return -1;
		}
		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return arr[mid];
			} else if (arr[mid] < target) {
				start = mid + 1;
				//end = mid - 1;
			} else {
				end = mid - 1;
				//start = mid + 1;
			}
		}
		return arr[start];
	}

	
}
