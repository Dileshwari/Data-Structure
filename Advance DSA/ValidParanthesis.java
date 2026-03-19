package StackQueue;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()}{}{}";

		System.out.println(isValidParanthesis(s));

	}

	private static boolean isValidParanthesis(String s) {
		// TODO Auto-generated method stub
		Stack<Character> c = new Stack<>();

		for (char ch : s.toCharArray()) {

			if (ch == '(' || ch == '{' | ch == '[') {

				c.push(ch);
			} else {
				if (ch == ')') {

					if ( c.isEmpty() ||c.pop() != '(') {

						return false;

					}
				}

				if (ch == '}') {

					if (c.isEmpty() ||c.pop() != '{') {

						return false;

					}
				}
				if (ch == ']') {

					if (c.isEmpty() ||c.pop() != '[') {

						return false;

					}
				}
			}

		}
		return c.isEmpty();
	}

}
