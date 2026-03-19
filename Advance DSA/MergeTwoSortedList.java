package Collection;

public class MergeTwoSortedList {
	private Node head;
	private Node tail;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedList s = new MergeTwoSortedList();
		s.insertLast(1);
		s.insertLast(1);
		s.insertLast(2);
		s.insertLast(3);
		s.insertLast(3);
		s.display();
		System.out.println();

		MergeTwoSortedList first = new MergeTwoSortedList();
		first.insertLast(1);
		first.insertLast(1);
		first.insertLast(2);
		first.insertLast(3);

		MergeTwoSortedList second = new MergeTwoSortedList();
		second.insertLast(1);
		second.insertLast(8);
		second.insertLast(9);

		
		first.display();
		System.out.println();
		second.display();
		System.out.println();
		MergeTwoSortedList l=mergetwosortedList(first, second);
		l.display();
	}

	private static MergeTwoSortedList mergetwosortedList(MergeTwoSortedList first, MergeTwoSortedList second) {
		Node head1 = first.head;
		Node head2 = second.head;
		MergeTwoSortedList ans = new MergeTwoSortedList();
		while (head1 != null && head2 != null) {

			if (head1.value < head2.value) {

				ans.insertLast(head1.value);
				head1 = head1.next;
			}

			else {

				ans.insertLast(head2.value);
				head2 = head2.next;
			}

		}

		while (head1 != null) {

			ans.insertLast(head1.value);
			head1 = head1.next;
		}

		while (head2 != null) {

			ans.insertLast(head2.value);
			head2 = head2.next;
		}
		
		return ans;
	}

	private void insertLast(int value) {

		Node n = new Node(value);
		if (tail == null) {

			insertFirst(value);
			return;
		}

		tail.next = n;
		tail = n;

	}

	private void insertFirst(int value) {
		Node n = new Node(value);
		n.next = head;
		head = n;
		if (tail == null) {

			tail = head;
		}

	}

	private void display() {
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.value + "--->");
			temp = temp.next;

		}
		System.out.print("END");
	}

	private class Node {

		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}

		Node(int value, Node node) {

			this.value = value;
			this.next = node;
		}
	}

}
