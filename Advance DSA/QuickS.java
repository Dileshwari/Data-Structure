package Dileshwari;

import java.util.Arrays;

public class QuickS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {8,3,4,12,5,6};
     quicksort(arr, 0, arr.length-1);
     System.out.println(Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int i, int j) {
	if(i>=j) {
		
		return ;
	}
		int s=i;
		int e=j;
		int mid=(s+e)/2;
		int pivot=arr[mid];
		
		while(s<=e) {
			
			while(arr[s]<pivot) {
				s++;
				
			}while(arr[e]>pivot) {
				
				e--;
			}
	  if(s<=e) {
		  
		  int temp=arr[s];
		  arr[s]=arr[e];
		  arr[e]=temp;
		  s++;
		  e--;
	  }
		}
		
		
		quicksort(arr, i, e);
		quicksort(arr,s, j);
	}

}
