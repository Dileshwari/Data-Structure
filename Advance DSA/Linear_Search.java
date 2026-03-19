package Dileshwari;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {3,5,6,12,12,89,80,34,1,2};
     int target=6;
     int index=LinearSearch(arr, target);
     System.out.println(index);
     
 
	}

	
	private static int LinearSearch(int[] arr, int target) {
		int min=arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {

			if(min<=arr[i])
			{
				
			}else {
				
				min=arr[i];
			}

		}
		
		
		return min;

	}
}
