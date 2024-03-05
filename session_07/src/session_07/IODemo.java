package session_07;

import java.io.*;

public class IODemo
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:\\core_java_T2406080332", true);
			//fos.write(65);
			String str = "JSPM Batch 03";
			byte [] b = str.getBytes();
			fos.write(b);
			System.out.println("Succes");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
			fos.close();
		}
	}
}
