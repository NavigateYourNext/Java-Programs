package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintStarRightSide {

	public static void main(String[] args)throws Exception {

		int i,j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many lines :");
		int no = Integer.parseInt(br.readLine());

		for( i=1; i<=no; i++)
		{
			System.out.println();
			for( j=(no-i); j>=1; j--)
			{
				System.out.print(" ");
			}

			for( j=1; j<=i; j++)
			{
				System.out.print("*");
			}

		}

	}
}