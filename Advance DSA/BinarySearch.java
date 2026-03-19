package Dileshwari;

public class BinarySearch {

	public static void main(String[] args) {
		//int[] arr = {2,3,4,5,6,7,8,9,10};
		int[] arr= {};
		System.out.println(even(arr,2));

	}

	private static int even(int[] arr ,int target) {
		
		int start=0;
		int end=arr.length-1;
		if(arr.length==0) {
			
			return -1;
		}
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(arr[mid]==target) {
				
				return  mid;
			}else if(arr[mid]<target) {
				end=mid-1;
				//start=mid+1;
			}else {
				//end=mid-1;
				start=mid+1;
				
			}
		}
		return -1;
	}

}
