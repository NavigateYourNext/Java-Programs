package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorsOfANumber 
{

	public static void main(String[] args)throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter A No To Find Factorial :");
		int no = Integer.parseInt(br.readLine());
		
		System.out.println("Factors of "+no+ " are as follows:");
		for(int i=1; i<=no; i++)
		{
			if(no%i == 0)
				System.out.print(i+" ");
		}

	}

}
