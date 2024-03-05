package session_06;

public class B extends A {
	public  B()
	{
		super();
		System.out.println("Default constructor of  class B");
	}
	
	public B(int b)
	{
		super(20);
		System.out.println("Parameterised constructor of class B" + b);
	}
	
	public static void main(String args[])
	{
//		B b=new B();
		B b=new B(10);
		
	}
}
