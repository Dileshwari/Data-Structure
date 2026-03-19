package Dileshwari;

public class FindinMoutainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,2};
		int target = 2;

		System.out.println(Search(arr, target));

	}

	private static int Search(int[] arr, int target) {
		int peak = peakElementinMoutainArray(arr);
		System.out.println(arr[peak]);
         
			int  index=  binarySearch(arr, 0, peak, target);
		
        if(index !=-1) {
		return index;
        }
         return binarySearch1(arr, peak+1, arr.length, target);
        

	}

	

	private static int peakElementinMoutainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = (start + end) / 2;
			if (arr[mid] < arr[mid + 1]) {

				start = mid + 1;
			} else {

				end = mid;
			}
		}

		return start;
	}
	
private static int binarySearch(int[] arr ,int start, int end, int target) {
		
		
		if(arr.length==0) {
			
			return -1;
		}
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(arr[mid]==target) {
				
				return  mid;
			}else if(arr[mid]<target) {
			//	end=mid-1;
			start=mid+1;
			}else {
				end=mid-1;
				//start=mid+1;
				
			}
		}
		return -1;
	}

private static int binarySearch1(int[] arr ,int start, int end, int target) {
	
	
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
