
public class Addition
{
	public void add(int a, int b)
	{
		System.out.println("Add = "+(a+b));
	}
	
	public float add(float a, float b)
	{
		float f = a+b;
		return f;
	}
	
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	
	public int add(int... a)
	{
		int sum = 0;
		int len = a.length;
		System.out.println("Length = "+len);
		for (int i=0;i<len;i++)
		{
			sum = sum+a[i];
			sum+=a[i];
		}
		for (int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		Addition a = new Addition();
		
		System.out.println("Sum = "+a.add(10.2f, 56.23f));
		
	}
}
