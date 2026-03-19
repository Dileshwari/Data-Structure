
public class ArrayZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 2, 3, 0, 0, 1, 0 };
		MoveZeroInFront(arr);
		
		for(int i:arr) {
			
			System.out.print(i+ " ");
		}
	}

	private static void MoveZeroInFront(int[] arr) {
		int n=arr.length;
		int j=n-1;
		
		for(int i=n-1;i>=0;i--) {
			
			if(arr[i] !=0) {
				
				arr[j]=arr[i];
				j--;
			}
		}
		
		while(j>=0) {
			
			arr[j]=0;
			j--;
		}
		
	}

}
