package session_05;

public class Test {
	
	public static void main(String[] args)
	{
		//data_type arr_name = new data_type[size];
		int[] arr = new int[5];
		System.out.println(arr[0]);
		//arr[0]=1;
		//arr[1]=2;
		
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = i+1;
			}
			
			System.out.println("Array elements are as follows:");
			for(int a:arr)
			{
				System.out.print(a);
			}
	}

}
