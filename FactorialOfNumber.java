package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialOfNumber {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter A No To Find Factorial :");
		int no = Integer.parseInt(br.readLine());
		
		int fact = factorial(no);
		
		System.out.println("Factorial of "+no+" is : "+fact);
	}
	
	public static int factorial(int no)
	{
		int fact = 1;
		for(int i=1; i<=no; i++)
		{
			fact = fact*i;
		}
		return fact;
	}

}
