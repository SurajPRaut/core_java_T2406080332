package session_09;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("z");
		t.add("Z");
		//t.add(10);//ClassCastException
		//t.add(null);//NullPointerException
		System.out.println(t);
		
		
		
	}

}