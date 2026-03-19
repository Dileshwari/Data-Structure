package Collection;

public class InsertNewNodeInLinkedList {
	private static Node head;
	private static Node tail;
	private static int size;

	InsertNewNodeInLinkedList() {

		this.size = 0;
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

	private static void display() {

		Node temp = head;
		while (temp != null) {

			System.out.print(temp.value + "--->");
			temp = temp.next;

		}
		System.out.print("END");
	}

	public static void main(String[] args) {

		InsertNewNodeInLinkedList l = new InsertNewNodeInLinkedList();
		// l.insertFirst(19);
		// l.insertFirst(20);
		// l.insertFirst(30);
		// l.insertLast(100);
		l.insertLast(6);
		l.insertLast(2);
		l.insertLast(6);
		l.insertLast(3);
		l.insertLast(4);
		l.insertLast(5);
		l.insertLast(6);
		l.display();
		// l.InsertNodeinMid(200, 2);

		/*
		 * System.out.println(); System.out.println(l.deleteFirst()); l.display();
		 * System.out.println(); System.out.println(l.deleteLast()); l.display();
		 * 
		 * System.out.println(); System.out.println(l.deletefromMid(3)); l.display();
		 */

		System.out.println();
		// System.out.println(l.find(900));
		l.removeElements(6);
		l.display();

	}

	public Node removeElements(int val) {
		Node temp = head;
		if (head == null) {

			return null;
		}

		if (head.value == val) {

			head = head.next;
		}
		while(temp.next!=null) {
			
			if(temp.next.value ==val) {
				
				temp.next=temp.next.next;
				
			}else {
				
				temp=temp.next;
			}
		}
			
		
		return temp;

	}

	private int find(int value) {
		Node temp = head;
		int i = 0;
		while (i < size) {

			if (head.value == value) {

				return head.value;
			}
			i++;
		}
		return -1;
	}

	private int deletefromMid(int index) {
		if (index == 0) {
			return deleteFirst();

		}
		if (index == size) {

			return deleteLast();
		}
		Node prev = get(index - 1);
		int value = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return value;
	}

	private static int deleteLast() {
		Node secondLast = get(size - 2);
		secondLast.next = null;
		tail = secondLast;
		size--;
		return secondLast.value;
	}

	private static Node get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;

		}
		return temp;
	}

	private static int deleteFirst() {
		int value = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return value;

	}

	private void InsertNodeinMid(int value, int index) {

		if (index == 0) {

			insertFirst(value);
			return;
		}
		if (index == size) {

			insertLast(value);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {

			temp = temp.next;

		}
		Node neeNode = new Node(value, temp.next);
		temp.next = neeNode;
		size++;
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

}
