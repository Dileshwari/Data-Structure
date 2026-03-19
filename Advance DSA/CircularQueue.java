package StackQueue;

public class CircularQueue {
	private static final int defaultsize = 3;
	protected int end = 0;
	protected static int front = 0;
	public static int[] data;
	private static int size = 0;

	CircularQueue() {

		this(defaultsize);
	}

	public CircularQueue(int size) {
		this.data = new int[size];
	}

	public static boolean isFull() {
		return size == data.length;
	}

	public static boolean isEmpty() {

		return size == 0;
	}

	public boolean insert(int item) throws Exception {

		if (isFull()) {

			System.out.println("circular queue is full");
			return false;
		}

		data[end++] = item;
		end = end % data.length;
		size++;
		return true;

	}

	public static int remove() throws Exception {

		if (isEmpty()) {

			throw new Exception("circular queue is empty, cannot remove data from circular queue");
		}

		int remove = data[front++];
		front = front % data.length;
		size--;

		return remove;
	}
	
	public static int front() throws Exception {

		if (isEmpty()) {

			throw new Exception("circular queue is empty");
		}

		return data[front];
	}
	public void display() throws Exception {
		if (isEmpty()) {

			throw new Exception("circular queue is empty");
			//return;
		}

		int i=front;
		do {
			
			System.out.print(data[i] + " <--");
			i++;
			i=i%data.length;
		}while(i !=end);

			
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CircularQueue c=new CircularQueue(5);
		c.insert(3);
		c.insert(6);
		c.insert(5);
		c.insert(19);
	    c.insert(1);
		c.display();
		System.out.println();
	    c.insert(11);
		c.display();
		System.out.println();
		
		System.out.println(c.remove());
		c.insert(133);
		c.display();
	}
	
	
}
