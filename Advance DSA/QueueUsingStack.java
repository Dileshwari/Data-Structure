package StackQueue;

import java.util.Stack;

public class QueueUsingStack {
	
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;

		QueueUsingStack() {

			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}

		public void add(int item) {

			stack1.push(item);

		}

		public int remove() {
			while (!stack1.empty()) {

				stack2.push(stack1.pop());
			}
			int remove = stack2.pop();
			while (!stack2.empty()) {

				stack1.push(stack2.pop());
			}

			return remove;
		}

		public boolean empty() {

			return stack1.empty();
		}

		public int peek() {

			while (!stack1.empty()) {

				stack2.push(stack1.pop());
			}
			int peeked = stack2.peek();
			System.out.println(peeked);
			while (!stack2.empty()) {

				stack1.push(stack2.pop());
			}

			return peeked;

		}

	

	public static void main(String[] args) {
		QueueUsingStack s=new QueueUsingStack();
		s.add(6);
		s.add(5);;
		s.add(4);
		s.add(3);
		s.add(2);
		s.add(1);
		s.remove();
		System.out.println(s);
		
		s.peek();
	}

	

}
