package Collection;

public class IspelindromeLinekdList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IspelindromeLinekdList e = new IspelindromeLinekdList();
		e.last(1);
		e.last(8);
		e.last(13);

		e.last(8);
		e.last(1);
		e.display();
		System.out.println();
		System.out.println(isPalindrome(head));

	}

	Node tail;
	static Node head;
	
	
	
	public static boolean isPalindrome(Node head) {
		if (head == null) {

			return true;
		}
		Node mid = middleNode(head);

		System.out.println(mid.value);
		
		
		Node SecondHalf = reveser(mid);
		Node rereverse = SecondHalf;

		while (head != null && SecondHalf != null) {

			if (head.value != SecondHalf.value) {

				break;
			}

			head = head.next;
			SecondHalf = SecondHalf.next;
		}

		reveser(rereverse);
		if (head == null || SecondHalf == null)

		{
			return true;
		}
		return false;

	}

	private static Node reveser(Node mid) {
		Node prev = null;
		Node pres = mid;
		Node next = pres.next;

		while (pres != null) {

			pres.next = prev;
			prev = pres;
			pres = next;

			if (next != null) {

				next = next.next;
			}
		}

		return prev;

	}

	
	
	public static Node middleNode(Node node) {
		Node fast = head;
		Node slow = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				
			}

			return slow;
		}

	private void last(int i) {

		Node n = new Node(i);
		if (head == null) {

			head = n;
			tail = n;
			return;

		}

		tail.next = n;
		tail = n;

	}

	private void display() {
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.value + "-->");
			temp = temp.next;

		}
	}

	class Node {

		private Node next;
		private int value;

		Node(int value) {

			this.value = value;

		}

	}
}