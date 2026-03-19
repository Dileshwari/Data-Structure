package Dileshwari;

public class FindTheSumofALLIndices {

	public static void main(String[] args) {
		
		int[] arr= {1,6,8,2,7,16};
		int sum=0;
		for(int i=2;i<arr.length;i++) {
			
			
			sum=sum+arr[i];
		}
		System.out.print(sum);
	}

}
