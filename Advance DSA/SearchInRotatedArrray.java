package Dileshwari;

public class SearchInRotatedArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 8;
		Solution v=new Solution();
		System.out.println(v.search(arr, target));

	}
}
class Solution {
    public int search(int[] arr, int target) {
        
    

        int pivot=pivotE(arr);
        if(pivot==-1){

            return binary_Search11(arr, target, 0, arr.length-1);
        }
        if(arr[pivot]==target){

            return pivot;

        }

        if(arr[0]<=target){

            return binary_Search11(arr, target, 0, pivot-1);
        }else{

            return binary_Search11(arr, target, pivot+1, arr.length-1);
        }

    }

    public static int pivotE(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int mid=(start+end)/2;
           if(mid<end && arr[mid]>arr[mid+1]){


               return mid;
           }
           if(mid>start && arr[mid]<arr[mid-1]){

               return mid-1;
           }
           if(arr[start]>=arr[mid]){

               end=mid-1;

           }else{

              start=mid+1;
           }

        }

    return -1;
    }


    private static int binary_Search11(int[] arr, int s, int start, int end) {


        while(start<=end){

            int mid=(start+end)/2;
            if(arr[mid]==s){

                return mid;
            }
            else if(arr[mid]>s){


                end=mid-1;
            }else{

                start=mid+1;
            }
        }
        return -1;

    }
}