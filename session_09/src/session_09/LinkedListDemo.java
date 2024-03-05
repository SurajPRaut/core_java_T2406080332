package session_09;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("mayuri");
		l.add(30);
		l.add(null);
		l.add("mayuri");
		System.out.println(l);
		l.set(0, "rahul");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("mayuri");
		System.out.println(l);
	}
}