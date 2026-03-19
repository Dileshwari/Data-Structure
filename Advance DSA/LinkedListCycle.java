package Collection;

public class LinkedListCycle {

	private static Node head;
	private Node tail;

	private int size;

	LinkedListCycle() {

		this.size = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListCycle l = new LinkedListCycle();
		l.insertLast(1);
		l.insertLast(2);
		l.insertLast(3);
		l.insertLast(4);
		l.insertLast(5);

		Find_MiddlePert(head);
		l.display();

	}

	private void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "-->");
			temp = temp.next;

		}
		System.out.println("END");
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

	// check cycle is present in linkedlist or not
	private boolean checkCycleInLinkedList(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {

				return true;

			}
		}
		return false;

	}

	// if cycle is present in linked list, then check the length of cycle in linked
	// list

	private int cycleLength(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {

				Node temp = slow;
				int length = 0;
				do {

					temp = temp.next;
					length++;

				} while (temp != slow);
				return length;
			}
		}
		return -1;

	}

	// return starting pointer of the cycle in LL
	private Node CycleStrtingPointInLL(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {

				break;
			}
		}
		if (fast == null || fast.next == null) {

			return null;
		}

		while (head != slow) {

			head = head.next;
			slow = slow.next;
		}
		return head;

	}
	// find middle of the linked list

	private static Node Find_MiddlePert(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
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
