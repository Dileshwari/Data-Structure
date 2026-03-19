package Collection;

public class DLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL d = new DLL();
		d.adddublyLinkedList(23);
		d.adddublyLinkedList(2);
		d.adddublyLinkedList(19);

		// add element in the first
		d.adddublyLinkedList(1);
		d.display();
		System.out.println();

		// reverse doubly linked list
		d.displayReverse();
		System.out.println();

		// add elemt in the last
		d.AddLastdublyLinkedList(100);
		d.display();

		System.out.println();

		// add element in the middle
		d.AddInMiddledublyLinkedList(2, 67);
		d.display();

	}

	private void AddInMiddledublyLinkedList(int after, int value) {
		Node temp = find(after);
		System.out.println(temp.value);
		if(temp==null) {
			
			System.out.println("node not exist");
			return;
		}
		
		Node n=new Node(after);
		n.next=temp.next;
		temp.next=n;
		n.prev=temp;
		if(n.next!=null) {
		temp.next.prev=n;
		}
		n.value=value;
	}

	private Node find(int value) {
		Node temp=head;
		while(temp!=null) {
			
			if(temp.value==value) {
				
				return temp;
			}
			temp=temp.next;
		}
		return null;
	}

	private void AddLastdublyLinkedList(int value) {
		Node temp = head;
		Node n = new Node(value);
		while (temp.next != null) {

			temp = temp.next;
		}

		temp.next = n;
		n.prev = temp;
		n.next = null;

	}

	private void displayReverse() {

		Node temp = head;
		Node last = null;
		while (temp != null) {
			last = temp;
			temp = temp.next;

		}
		while (last != null) {

			System.out.print(last.value + "-->");
			last = last.prev;
		}
		System.out.print("End");
	}

	private void display() {
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.value + "-->");
			temp = temp.next;
		}

		System.out.print("END");
	}

	Node head;

	public void adddublyLinkedList(int value) {

		Node n = new Node(value);
		n.next = head;
		n.prev = null;
		if (head != null) {
			head.prev = n;
		}

		head = n;
	}

	private class Node {

		private Node prev;
		private Node next;
		private int value;

		Node(Node prev, Node next, int value) {

			this.prev = prev;
			this.next = next;
			this.value = value;
		}

		Node(int value) {

			this.value = value;
		}
	}
}
