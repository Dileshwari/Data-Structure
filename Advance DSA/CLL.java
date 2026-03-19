package Collection;

public class CLL {
	private Node tail;
	private Node head;

	public static void main(String[] args) {
		CLL c = new CLL();
		c.insertNewNode(23);
		c.insertNewNode(2);
		c.insertNewNode(22);
		c.insertNewNode(1);
		c.insertNewNode(6);
		c.insertNewNode(90);
		c.display();

	}

	CLL() {

		this.head = null;
		this.tail = null;
	}

	private void insertNewNode(int value) {
		Node n = new Node(value);
		if (head == null) {

			head = n;
			tail = n;
			return;
		}

		n.next = head;
		tail.next = n;
		tail = n;

	}

	private void display() {
		Node temp = head;
		do {

			System.out.print(temp.value + "-->");
			temp = temp.next;
		} while (temp != head);

		System.out.print("HEAD");
	}

	class Node {

		private int value;
		private Node next;

		Node(int value) {

			this.value = value;
		}

		Node(Node next, int value) {
			this.next = next;
			this.value = value;
		}

	}

}
