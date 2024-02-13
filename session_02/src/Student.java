
public class Student
{
	private int rollNo;
	private String name;
	
	public Student ()
	{
		//this(2,"Aishwarya");
		System.out.println("Default Constructor");
		
	}
	
	public Student(int rollNo,String name)
	{
		this();
		System.out.println("Parameterized Constructor");
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString() {
		return "Student [rollNo" + rollNo + ", name"+ name + "]"; 
	}
	
	public static void main(String[] args)
	{
		Student s = new Student(1, "Rahul");
		System.out.println(s);
		//Student s = new Student();
		//System.out.println(s);
	}
}
