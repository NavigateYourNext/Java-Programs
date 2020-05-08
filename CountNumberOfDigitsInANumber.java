package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountNumberOfDigitsInANumber 
{
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A Number : ");

		int no = Integer.parseInt(br.readLine());

		int result = countOfDigits(no);

		System.out.println("Count Of Digits Is : "+result);

	}

	public static int countOfDigits(int no)
	{

		
		int rem = 0;
		int count = 0;

		while(no != 0)
		{
			rem = no%10;
			count++;
			no=no/10;
		}

		return count;

	}

}
