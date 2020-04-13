package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfDigits {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A Number : ");

		int no = Integer.parseInt(br.readLine());

		int result = sumOfDigits(no);
		
		System.out.println("Sum Of Digits Is : "+result);
		
	}

	public static int sumOfDigits(int no)
	{

		int temp;
		int rem = 0;
		int sum = 0;

		temp = no;

		while(no != 0)
		{
			rem = no%10;
			sum = sum+rem;
			no=no/10;
		}

		return sum;

	}

}
