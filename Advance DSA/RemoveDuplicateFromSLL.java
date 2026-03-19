package Collection;

public class RemoveDuplicateFromSLL {
	private Node head;
	private Node tail;
	private int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateFromSLL s = new RemoveDuplicateFromSLL();
		s.insertLast(1);
		s.insertLast(1);
		s.insertLast(2);
		s.insertLast(3);
		s.insertLast(3);
		s.display();
		System.out.println();
		s.removeDuplicate();
		s.display();
	}

	private void removeDuplicate() {
		Node temp = head;
		while (temp.next != null) {
			if (temp.value == temp.next.value) {

				temp.next = temp.next.next;
			}else {
			 temp = temp.next;
			}
		}
		 tail=temp;
		 tail.next=null;

	}

	private void insertLast(int value) {

		Node n = new Node(value);
		if (tail == null) {

			insertFirst(value);
			return;
		}

		tail.next = n;
		tail = n;
		size++;
	}

	private void insertFirst(int value) {
		Node n = new Node(value);
		n.next = head;
		head = n;
		if (tail == null) {

			tail = head;
		}
		size++;
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
