package session_04;

public class Date {
	
	private int dd,mm,yy;
	
	public Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String toString()
	{
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	

}


//final variable

//private final float PI; or  private final float PI = 3.14f;

//public Date()
//{
//	PI = 3.14f;
//}
