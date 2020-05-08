package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number To Find Fibonnaci Series : ");
		int a = Integer.parseInt(br.readLine());
		
		//Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 etc.
		
		int t1 = 0;
		int t2 = 1;
		int sum = 0;
		
		System.out.println("Fibonacci Series till "+a+" numbers is: ");
		System.out.print(t1+" "+t2+" ");
		for(int i=0; i<a; i++)
		{
			sum = t1+t2; //1+0 = 1
			t1 = t2; //1
			t2 = sum;//1
			
			System.out.print(t2+" ");
		}

	}

}
