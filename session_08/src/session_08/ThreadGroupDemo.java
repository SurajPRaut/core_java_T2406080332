package session_08;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getThreadGroup().getName());
System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
	ThreadGroup g1 = new ThreadGroup("First Group");
	System.out.println(g1.getParent().getName());//main
	ThreadGroup g2 = new ThreadGroup(g1,"Second Group");
System.out.println(g2.getParent().getName()+" "
		+ ""+g2.getName());
	}
}
