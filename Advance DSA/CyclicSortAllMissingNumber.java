package Dileshwari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortAllMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,5,7,5,9};
		List<Integer>  k=CyclicSort(arr);
		System.out.println(k);
	}

	private static List<Integer> CyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			
			
			int swap=arr[i]-1;
			
			if(arr[i] !=arr[swap]) {
				int temp=arr[i];
				arr[i]=arr[swap];
				arr[swap]=temp;
			}else {
				
				i++;
			}
				
			
		}
		List<Integer> list=new ArrayList<>();
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]!=j+1) {
				list.add(j+1);
				
				
			}
		}
		return list;
		
		
	}

}
