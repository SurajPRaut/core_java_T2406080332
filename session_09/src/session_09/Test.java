package session_09;

import java.util.TreeSet;

public class Test {	
	public static void main(String[] args) {
		/*System.out.println("A".compareTo("a"));
		System.out.println("b".compareTo("B"));
		System.out.println("C".compareTo("C"));*/
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);//0,10,15
	}
}
/*
t.add(10);			[10]
t.add(0);	 0.compareTo(10)  [0,10]
t.add(15);	15.compareTo(0)	[0,15,10]
			15.compareTo(10)[0,10,15]
t.add(10);	10.compareTo(0)	[0,10,10,15]
			10.compareTo(10) [0,10,15]*/
