
public class MaximumValSlidingWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6, 8, 3, 4, 5, 6, 7, 8, -2, -4, -6 };

		int window = 3;

		slidingwindow(arr, window);
		System.out.println();
		slidingwindow1(arr, window);
	}

	private static void slidingwindow(int[] arr, int window) {

		int max = 0;
		
		for (int i = 0; i <= arr.length - window; i++) {
						max = 0;
			for (int j = i; j < i + window; j++) {

				if (max < arr[j])
					max = arr[j];
				else {

					if (max > arr[j] && i == j) max = arr[j];

				}

			}
			System.out.print(max+" ");

		}

	} 

	private static void slidingwindow1(int[] arr, int window) throws Exception {
	
	 if(arr==null || arr.length==0 || window<=0 || window> arr.length) {
		  
		 throw new Exception("Invalid input");
	 } 
	 
	 
	 for(int i=0; i<=arr.length-window;i++) {
		 int max=arr[i];
		 for(int j=i+1;j<i+window;j++) {
			 
			 if(max<arr[j]) {
				 
				 max=arr[j]; 
			 }
		 }
		 System.out.print(max+" ");
		 
	 }
	 System.out.println();
	}

}
