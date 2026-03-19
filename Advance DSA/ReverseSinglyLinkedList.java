package Collection;

public class ReverseSinglyLinkedList {
	Node head;
	Node tail;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSinglyLinkedList e = new ReverseSinglyLinkedList();
		e.last(1);
		e.last(2);
		e.last(3);
		e.last(4);

		e.display();
		System.out.println();
		Node n= e.reveser();
		System.out.println(n.value);
		

	}

	private Node reveser() {
		Node prev=null;
		Node pres=head;
		Node next=pres.next;
		
		while(pres !=null) {
			
			pres.next=prev;
			prev=pres;
			pres=next;
			
			if(next !=null) {
				
				next=next.next;
			}
		}
		
		return prev;
		
		
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
