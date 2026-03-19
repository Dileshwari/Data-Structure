package StackQueue;

public class CustomrStack {

	private static final int defaultsize = 1;
	private static int ptr = -1;
	public static int[] data;

	CustomrStack() {

		this(defaultsize);
	}

	public CustomrStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int item) {

		if (isFull()) {

			System.out.println("stack is full");
			return false;
		}

		ptr++;
		data[ptr] = item;
		return true;
	}

	public static boolean isFull() {
		return ptr == data.length - 1;
	}

	public static int pop() throws ExceptionClassCustomeStack {

		if (isEmpty()) {

			throw new ExceptionClassCustomeStack("data cannot pop from stack");
		}

		int d = data[ptr--];
		//System.out.println(d);
		return d;
	}

	public static boolean isEmpty() {

		return ptr == -1;
	}

	public static int peek() throws ExceptionClassCustomeStack {

		if (isEmpty()) {
			throw new ExceptionClassCustomeStack("data cannot peek from stack");

		}
		return data[ptr];
	}

	public static void main(String[] args) throws ExceptionClassCustomeStack {

		CustomrStack c = new CustomrStack(2);
		c.push(89);
		c.push(2);
		c.push(1);
		
		System.out.println(c.pop());
		
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		//System.out.println(c.pop());
		//System.out.print(c);

	}

}
