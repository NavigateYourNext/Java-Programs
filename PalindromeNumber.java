package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeNumber {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A Number : ");

		int no = Integer.parseInt(br.readLine());

		boolean result = palindrome(no);

		if(result)
			System.out.println("Number Is Palindrome");
		else
			System.out.println("Number Is Not Palindrome");

	}

	public static boolean palindrome(int no)
	{

		int temp;
		int rem = 0;
		int sum = 0;

		temp = no;

		while(no != 0)
		{
			rem = no%10;
			sum = (sum*10)+rem;
			no=no/10;
		}

		if(temp == sum)
			return true;
		else
			return false;

	}

}
