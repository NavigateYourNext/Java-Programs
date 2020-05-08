package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumberProgram 
{

	public static void main(String[] args)throws Exception
	{
		
		//Smallest prime number is 2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A No :");
		int no = Integer.parseInt(br.readLine());

		boolean flag = true;

		if(no == 1)
			flag = false;
		else
		{
			for(int i=2; i<=no/2; i++)
			{
				if(no % i == 0)
				{
					flag = false;
					break;
				}
			}
		}

		if(flag)
			System.out.println(no+" is a prime number");
		else
			System.out.println(no+" is not a prime number");

	}

}
