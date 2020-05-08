package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargestOfThreeNumbers
{

	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st Number : ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter 2nd Number : ");
		int b = Integer.parseInt(br.readLine());

		System.out.println("Enter 3rd Number : ");
		int c = Integer.parseInt(br.readLine());

		//By using if-else
		if(a > b && a > c)
		{
			System.out.println("Greater Number Is: "+a);
		}
		else if(b > c)
		{
			System.out.println("Greater Number Is: "+b);
		}
		else
		{
			System.out.println("Greater Number Is: "+c);
		}

		//By using conditional operators

		int d = (a>b && a>c)?a:(b>c?b:c);
		System.out.println("Greater Number Is: "+d);

	}

}
