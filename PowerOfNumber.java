package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerOfNumber {

public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter A No To Find Power :");
		int no = Integer.parseInt(br.readLine());
		System.out.println("Enter Raised To Number :");
		int no1 = Integer.parseInt(br.readLine());
		
		int fact = power(no,no1);
		
		System.out.println("Power of "+no+" is : "+fact);
	}
	
	public static int power(int no,int no1)
	{
		int pow = 1;
		for(int i=1; i<=no1; i++)
		{
			pow = no*pow;
		}
		return pow;
	

	}

}
