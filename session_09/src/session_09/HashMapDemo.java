package session_09;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap m = new HashMap<String, Integer>();
		m.put("chitra", 700);
		m.put("tejas", 800);
		m.put("alisha", 200);
		m.put("shreyash", 500);
		System.out.println(m);
		System.out.println(m.put("chitra", 100));//700
		System.out.println(m);
	}

}