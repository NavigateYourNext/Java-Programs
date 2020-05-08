package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfNaturalNumbers 
{

	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number To Find Natural Numbers : ");
		int a = Integer.parseInt(br.readLine());
		
		int sum  = 0;
		for(int i=1; i<=a; i++)
			sum = sum+i;
		
		System.out.println("Sum of first "+a+" natural numbers are: "+sum);

	}

}
