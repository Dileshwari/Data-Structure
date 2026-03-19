package Dileshwari;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
   while(true) {
	   System.out.println("enter an opeartor");
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		char c = sc.next().trim().charAt(0);
		if (c == '+' || c == '-' || c == '/' || c == '%' || c == '*') {
			 System.out.println("enter a n");
			
			int n = sc.nextInt();
			 System.out.println("enter v m");
			int m = sc.nextInt();

			if (c == '+') {

				System.out.println(n + m);
			}
			else if (c == '-') {

				System.out.println(n - m);
			}
			else if (c == '/') {

				System.out.println(n / m);
			}
			else if (c == '%') {

				System.out.println(n % m);
			}
			else {
				
				System.out.println(n * m);
			}
			
			if(c =='X' || c=='x') {
				System.out.println(c);
				break;
				
			}
		}
	}
	}



//public class A {
    public boolean threeConsecutiveOdds(int[] arr) {
          int count =0;
        for(int i=0;i<arr.length;i++){
  
      if(arr[i] %2 !=0){
        count++;

        if(count==3){

            return true;
        }
      }else{

            count=0;
        }
    }
		return false;
}
}
