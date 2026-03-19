package Collection;



public class DeleteElementsLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public static void main(String[] args) {
		DeleteElementsLinkedList l = new DeleteElementsLinkedList();

		l.InsertInFirst(3);
		l.InsertInFirst(13);
		l.InsertInFirst(33);
		l.InsertInFirst(31);
		l.InsertInFirst(22);
		l.InsertInFirst(10);
		l.InsertInFirst(20);
		l.display();
		System.out.println(l.deleteFirst());
		l.display();
		System.out.println(l.deleteLast());
		l.display();
		System.out.println(l.delete(3));
		l.display();
		System.out.println(l.find(31));
		l.display();

	}

	private Node find(int val) {
		
		Node temp=head;
		while(temp!=null) {
			
			if(temp.value==val) {
				
				return temp;
			}
			temp=temp.next;
		}
		return temp;
		
	}

	private int delete(int index) {
		if(index==0) {
			
			return deleteFirst();
		}
		if(index==size-1) {
			
			return deleteLast();
		}
		
		Node prev=get(index-1);
		int valu=prev.next.value;
		prev.next=prev.next.next;
		return valu;
		
	}

	private int deleteLast() {
		
		if(size<=1) {
			return deleteFirst();
			
		}
		Node secondLast=get(size-2);
		tail=secondLast;
		tail.next=null;
		return tail.value;
		
		
	}

	private Node get(int secondlast) {
		
		Node temp=head;
		for(int i=0;i<secondlast;i++) {
			
			temp=temp.next;
		}
		return temp;
	}

	private void InsertInFirst(int val) {

		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
		if (tail == null)
			tail = head;
		size++;

	}

	private int deleteFirst() {

		int val = head.value;
		head = head.next;
		if (head == null) {

			tail = null;
		}
        size--;
		return val;

	}

	private void display() {
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.value + "-->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	class Node {

		private Node next;
		private int value;

		Node(int value) {

			this.value = value;
		}

		Node(int value, Node next) {

			this.value = value;
			this.next = next;
		}

	}

}
