package JavaPrograms;

import java.util.LinkedList;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertToDecimal(1011));
	}
	
	public static long convertToDecimal(long number)
	{
		long decimalNumber = 0;
		long i=0;
		while(number != 0)
		{
			long reminder = number%10;
			number = number/10;
			decimalNumber += reminder * Math.pow(2, i);
			++i;
		}
		
		return decimalNumber;
	}

}
