package session_09;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {	
		ArrayList a = new ArrayList();
		a.add("A");
		a.add('a');
		a.add(10);
		a.add(null);
		a.add(10);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2, "M");
		System.out.println(a);
		a.add('n');
		System.out.println(a);
		
	}

}