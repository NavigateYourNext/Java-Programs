package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Armstrong Number - 1
public class ArmstrongNumber {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A Number : ");

		int no = Integer.parseInt(br.readLine());

		boolean result = armstrong(no);

		if(result)
			System.out.println("Number Is Armstrong");
		else
			System.out.println("Number Is Not Armstrong");

	}

	public static boolean armstrong(int no)
	{

		int temp;
		int rem = 0;
		int sum = 0;

		temp = no;

		while(no != 0)
		{
			rem = no%10;
			sum = sum+(rem*rem*rem);
			no=no/10;
		}

		if(temp == sum)
			return true;
		else
			return false;

	}


}


