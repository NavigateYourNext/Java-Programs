package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapTwoNumbers
{

	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 1st Number : ");
		int n1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter 2nd Number : ");
		int n2 = Integer.parseInt(br.readLine());
		
		/*//By using 3rd variable
		
		int temp = 0;
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("After Swapping Two Numbers: ");
		System.out.println("Number1: "+n1+"\nNumber2: "+n2);*/
		
		
		//Without using 3rd variable
		
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		
		System.out.println("After Swapping Two Numbers: ");
		System.out.println("Number1: "+n1+"\nNumber2: "+n2);
	}

}
