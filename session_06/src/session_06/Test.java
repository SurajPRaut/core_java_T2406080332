package session_06;

public class Test {
	public static void main(String args[])
	{
		BOI boi=new BOI();
		System.out.println("BOI rate"+boi.getROI());
		
		
		//polymorphic reference
		//Superclass reference = new child class object
		Bank b1=new SBI();
		System.out.println("SBI "+b1.getROI());
	}
}
