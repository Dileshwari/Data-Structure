package Dileshwari;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr = 5;
		for (int i = 0; i < arr; i++) {

			for (int j = 0; j < arr; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		for (int i = 0; i < arr; i++) {

			for (int j = 0; j <arr; j++) {

				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		for (int i = 0; i < arr; i++) {

			for (int j = 0; j <arr; j++) {

				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------");
		for (int i = 0; i < arr; i++) {

			for (int j = 0; j <=i; j++) {

				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		for (int i = 0; i < arr; i++) {

			for (int j = 0; j <=i; j++) {

				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		for (int i = 0; i < arr; i++) {

			for (int j = arr-i; j >0; j--) {

				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}	
}
