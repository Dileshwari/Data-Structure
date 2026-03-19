package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<Integer> s=new Stack<>();
     s.push(20);
     s.push(30);
     s.push(40);
     s.push(50);
     s.push(20);
     s.push(30);
     s.push(40);
     s.push(50);
     System.out.println("Initial stack:"+s);
     s.pop();
     System.out.println("After pop from stack"+s);
     System.out.println(s.peek());
     
     
     
     
     Queue<Integer> q=new LinkedList<>();
     q.add(3);
     q.add(34);
     q.add(67);
     q.add(90);
     q.add(67);
     q.add(90);
     System.out.println(q);
     System.out.println(q.peek());
  
     
     Deque<Integer>   d=new ArrayDeque<>();
     d.add(34);
     d.add(35);
     d.add(3);
     //d.getFirst()
     d.add(34);
     d.add(35);
     d.add(3);
     System.out.println(d.getFirst());
     System.out.println(d.getLast());
    
     System.out.println(d);
	}

}
