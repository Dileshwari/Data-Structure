package StackQueue;

public class CustomQueue {

	private static final int defaultsize = 3;
	private static int end = 0;
	public static int[] data;

	CustomQueue() {

		this(defaultsize);
	}

	public CustomQueue(int size) {
		this.data = new int[size];
	}

	public static boolean isFull() {
		return end == data.length;
	}

	public static boolean isEmpty() {

		return end == 0;
	}

	public boolean insert(int item) {

		if (isFull()) {

			System.out.println("queue is full");
			return false;
		}

		data[end++] = item;
		return true;
	}

	public static int remove() throws Exception {

		if (isEmpty()) {

			throw new Exception("queue is empty, cannot remove data from queue");
		}

		int remove = data[0];
		for (int i = 1; i < end; i++) {

			data[i - 1] = data[i];
		}
		end--;

		return remove;
	}

	public int front() throws Exception {

		if (isEmpty()) {
			throw new Exception("there is no value");

		}
		return data[0];

	}

	public void display() {

		for (int i = 0; i < end; i++) {

			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomQueue q = new CustomQueue(6);
		q.insert(34);
		q.insert(2);
		q.insert(1);
		q.insert(34);
		q.insert(2);
		q.insert(1);
		q.display();
		System.out.println();

		System.out.println(q.remove());
		q.display();

		System.out.println();

		System.out.println(q.front());
		q.display();
	}

}
