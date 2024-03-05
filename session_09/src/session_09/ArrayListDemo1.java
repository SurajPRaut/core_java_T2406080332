package session_09;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1 {
	public static void main(String[] args) {	
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			int i = itr.next();
			if((i%2) == 0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
		}
		
		System.out.println(l);
	}

}