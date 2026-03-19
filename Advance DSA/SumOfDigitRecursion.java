package Dileshwari;

public class SumOfDigitRecursion {

	public static void main(String[] args) {
		int n = 123456;
		
		//sum of given number
		int sum = sum_ofDigitusingRecursion(n);
		System.out.println(sum);
		
		//product
		int product =product_ofDigitusingRecursion(n);
		System.out.println(product);
		
		//revrse 
		int reverse =reverse_ofDigitusingRecursion(n, 0);
		System.out.println(reverse);
		
		
		//count zeros
		int number=101030190;
		int count=count_zeroingiven(number);
		System.out.println(count);
		
		//number of steps to reduce it to zero
		int num=123; //output =4
		
	    int reduceittoZero=reduceNumbertoZero(num);
	    System.out.println(reduceittoZero);
	}

	private static int reduceNumbertoZero(int num) {
		int count=0;
		while(num>0) {
		if((num &1) ==1) {
			
			num=num-1;
			
			
		} else {	
			num=num/2;
		}
		
		count++;
		
	}
		return count;
	}

	private static int count_zeroingiven(int n) {
		int count=0;
		int rev=0;
		
		while(n>0) {
			
			 rev=n%10;
			 if(rev==0) {
				 
				 count++;
			 }
			 n=n/10;
		} 
		return count;
	}

	private static int sum_ofDigitusingRecursion(int n) {

		if (n == 0) {

			return 0;
		}

		return (n % 10) + sum_ofDigitusingRecursion(n / 10);

	}
	
	private static int product_ofDigitusingRecursion(int n) {

		if (n == 0) {

			return 1;
		}

		return (n % 10) * product_ofDigitusingRecursion(n / 10);

	}
	
	private static int reverse_ofDigitusingRecursion(int n, int sum) {
          
		if (n == 0) {

			return sum;
		}
         
		return reverse_ofDigitusingRecursion ( (n / 10), sum * 10+(n % 10));

	}

}
