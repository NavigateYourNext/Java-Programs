package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursiveFactorialProgram {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A Number : ");
		int no = Integer.parseInt(br.readLine());

		System.out.println("Factorial Is: "+getFactorial(no));


	}

	public static int getFactorial(int no)
	{
		if(no >= 1)
			return no*getFactorial(no-1);
		else
			return 1;
	}

}


