package JavaPrograms;

import java.io.FileOutputStream;

public class WriteDataToFile 
{

	public static void main(String[] args)throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("test.txt");
		System.out.println("Enter Data To Write In A File :");
		
		int n;
		System.out.println("Press Ctrl+Z to Stop : ");
		while((n=System.in.read()) !=-1)
		{
			fos.write(n);
		}

		fos.close();
	}

}
