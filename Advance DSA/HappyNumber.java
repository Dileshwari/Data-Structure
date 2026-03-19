package Collection;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		System.out.println(findHappynumber(number));
	}

	private static boolean findHappynumber(int number) {
		int fast = number;
		int slow = number;

		do {

			fast = findNumber(findNumber(fast));
			slow = findNumber(slow);

		} while (slow != fast);

		if(slow ==1) return true;
		
		return false;
	}

	private static int findNumber(int number) {
		int ans = 0;
		while (number > 0) {

			int rem = number % 10;
			ans = ans + rem * rem;
			number = number / 10;
		}
		return ans;

	}

}
