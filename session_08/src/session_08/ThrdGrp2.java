package session_08;

public class ThrdGrp2 {
	
	public static void main(String[] args) {
		
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1,"First Thread");
		Thread t2 = new Thread(g1,"Second Thread");
		System.out.println(g1.getMaxPriority());//10
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		g1.setMaxPriority(3);
		System.out.println(g1.getMaxPriority());//3
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		Thread t3 = new Thread(g1,"Third Thread");
		System.out.println("t3 = "+t3.getPriority());//3
		
	}

}