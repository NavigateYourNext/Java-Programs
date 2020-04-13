package JavaPrograms;

import java.io.FileInputStream;

public class ReadDataFromFile {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis = new FileInputStream("test.txt");
		
		int n;
		
		System.out.println("File Contains : ");
		
		while((n=fis.read())!=-1)
		{
			System.out.print((char)n);
		}
			fis.close();
	}

}
