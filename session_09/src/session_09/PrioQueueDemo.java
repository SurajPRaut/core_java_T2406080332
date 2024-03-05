package session_09;

import java.util.PriorityQueue;

public class PrioQueueDemo {
	public static void main(String[] args) {	
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());//null
		for(int i=1;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
	}

}