
public class Demo {
	private int day, month, year;
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int m)
	{
		month = m;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.setDay(7);
		int a = d.getDay();
		System.out.println("Day = "+a);
		System.out.println("D = "+d.getDay());
		
		Demo m = new Demo();
		d.setMonth(5);
		int b = m.getMonth();
		System.out.println("Month = "+b);
		System.out.println("M = "+d.getMonth());
		
		Demo y = new Demo();
		d.setYear(2024);
		int c = y.getYear();
		System.out.println("Year = "+c);
		System.out.println("Y = "+d.getYear());
	}
	

}
