package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Year : ");
		int year = Integer.parseInt(br.readLine());
		
		//Centuary Year are leap years if they are perfect divisible by 400.
		//Other years are leap if they are perfectly divisible by 4.
		
		if(year%4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
					System.out.println(year+" is a leap year");
				else
					System.out.println(year+" is not a leap year");
			}
			else
				System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}

	}

}
