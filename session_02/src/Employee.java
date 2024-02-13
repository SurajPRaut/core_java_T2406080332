
public class Employee
{
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
	System.out.println("Default Constructor Called");
		empId = 111;
		empName = "Rahul";
		empSalary = 210000.67d;
	}
	
	public Employee(int i,String n,double d)
	{
		System.out.println("Parameterized Counstructor Called");
		empId = i;
		empName = n;
		empSalary = d;
	}
	
	public String toString()
	//String representation of an object - object class
	{
		return "Employee = "+empId+" "+empName+""+ " "+empSalary;
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		System.out.println(e);
		Employee e1 = new Employee(222, "Vishal",536214.89d);
		System.out.println(e1);
	}
}
