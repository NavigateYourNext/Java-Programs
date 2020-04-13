package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintSimpleStars 
{

	public static void main(String[] args)throws Exception 
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many lines :");
		int no = Integer.parseInt(br.readLine());

		for(int i=1 ; i<=no; i++)
		{
			System.out.println();
			for(int j=1; j<=i; j++)
				System.out.print("*");
		}

	}
}
