package Dileshwari;

public class FindithBit {

	public static void main(String[] args) {

		// find ith bit in the number
		int ith = 6;
		int n = 32;

		int k = n & (1 << (ith - 1));
		System.out.println(k);

		// set ith bit 100000
		int ithbit = 4;
		int number = 32;

		int ans = number | (1 << (ithbit - 1)); // 100000 | 001000
		System.out.println(ans);// 101000

		// reset ith bit 100000
		int resetith = 4;
		int num = 31;

		int ans1 = num ^ (1 << (resetith - 1)); // 10111
		System.out.println(ans1);// 101000

		// find the position of right most set bit

		int num1 = 110;

		int ans2 = num1 & (-num1); // 10111
		System.out.println(ans2);// 101000

// find number of set bit in the given number

		int num2 = 31;

		int ans3 = num2-(num2 & (-num2)); // 10111
		System.out.println(ans3);// 101000
		
		//integer to binary
		int n1=33;
		
		System.out.println(Integer.toBinaryString(n1));
		
	}

}
