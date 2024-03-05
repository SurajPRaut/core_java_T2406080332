package session_09;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.add("A");
		s.add("B");
		s.add("c");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("A"));
		System.out.println(s.search("C"));
		System.out.println(s.empty());
	}
}



/*
B
A
C
*/