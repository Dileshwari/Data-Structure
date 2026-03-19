package Collection;

public class DeletElementFromCLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletElementFromCLL d = new DeletElementFromCLL();
		d.insert(28);
		d.insert(4);
		d.insert(5);
		d.insert(6);
		d.insert(9);
		d.insert(28);
		d.insert(4);
		d.insert(6);
		d.insert(9);
		d.insert(9);
		d.display();
		System.out.println();
		d.deleteElement(9);
		d.display();

	}

	private void deleteElement(int value) {
		Node temp = head;
		if (head == null) {

			return;
		}

		if (head.value == value) {

			head = head.next;
			tail.next = head;
			return;

		}
		do {
			Node n = temp.next;
			if (n.value == value) {

				temp.next = n.next;
			} else {
				temp = temp.next;
			}
		} while (temp != head);

	}

	private void display() {
		Node temp = head;
		do {

			System.out.print(temp.value + "-->");
			temp = temp.next;

		} while (temp != head);

	}

	private void insert(int val) {

		Node newNode = new Node(val);
		if (head == null) {

			head = newNode;
			tail = newNode;
			return;
		}

		newNode.next = head;
		tail.next = newNode;
		tail = newNode;

	}

	private Node head;
	private Node tail;

	DeletElementFromCLL() {

		this.head = null;
		this.tail = null;
	}

	class Node {

		private int value;
		private Node next;

		Node(int value) {

			this.value = value;

		}

		Node(int value, Node next) {

			this.value = value;
			this.next = next;
		}
	}

}
