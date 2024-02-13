
public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employee() {}
	
	public Employee(int empId, String empName, float empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		count++;
	}
	
	public static int getcount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Employee [empId =" + empId +"," + "empName =" 
	+ "empName "+", + empSal =" + empSal +"]";
	}
	static
	{
		System.out.println("Static Block called!!");
		count = 60;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method called!!");
		Employee e1 = new Employee(111,"Rahul",56123.89f);
		System.out.println(e1);
		Employee e2 = new Employee(222,"Suresh",213546.59f);
		System.out.println(e2);
		Employee e3 = new Employee(333,"Ramesh",534153.69f);
		System.out.println(e3);
		
		System.out.println("Employee Count="+Employee.getcount());
		System.out.println("Employee Count="+e1.getcount());
		System.out.println("Employee Count="+e2.getcount());
		System.out.println("Employee Count="+e3.getcount());
	}
}

