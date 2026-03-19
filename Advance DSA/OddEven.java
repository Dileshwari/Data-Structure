package Dileshwari;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;

		int evenodd = oddeven(n);
		if (evenodd == 1) {

			System.out.println("odd");
		}else {
			
			System.out.println("even");
		}
	}

	private static int oddeven(int n) {

		return (n & 1);

	}
}
