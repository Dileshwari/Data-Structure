package Dileshwari;

public class Febonocci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(FebSeries(n));
	}
//0,1,1,2,3,5,8,13,21,34,55
	private static int FebSeries(int n) {
		int a = 0;
		int b = 1;
		if (n == 0 || n == 1) {
			return n;

		}

		return FebSeries(n - 1) + FebSeries(n - 2);

	}

}
