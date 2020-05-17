package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursiveNaturalNumbers {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A Number : ");
		int no = Integer.parseInt(br.readLine());
		
		System.out.println("Additon Of Natural Numbers Are: "+getSumOfNaturalNumbers(no));


	}
	
	public static int getSumOfNaturalNumbers(int no)
	{
		if(no != 0)
			return no+getSumOfNaturalNumbers(no-1);
		else
			return no;
	}

}
