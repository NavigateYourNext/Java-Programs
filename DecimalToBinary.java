package JavaPrograms;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
	
		System.out.println(convertToBinary(11));
	}
	
	public static long convertToBinary(long number)
	{
		long binaryNumber = 0;
		long i=1;

		while(number != 0)
		{
			long reminder = number%2;
			number = number/2;
			binaryNumber += reminder * i;
			i*=10;
		}
		
		return binaryNumber;
	}

}
