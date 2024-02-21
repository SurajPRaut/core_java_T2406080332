package session_07;

public class Test1 {
	public static void main(String[] args)
	{
		try
		{
			int c = 0;
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("c ="+c);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Enter only ineteger values");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter atlest 2 values");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Denominator should be zero");
		}
		catch (Exception e)
		{
			System.out.println("Exception!!!");
		}
	}
}