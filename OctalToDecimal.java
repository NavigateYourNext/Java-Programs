package JavaPrograms;

public class OctalToDecimal {

public static void main(String[] args) {
		
		System.out.println(convertToDecimal(116));
		

	}
	
	public static long convertToDecimal(long number)
	{
		long decimalNumber = 0;
		long i=0;
		while(number != 0)
		{
			decimalNumber+=(number%10)*Math.pow(8, i);
			number/=10;
			++i;
		}
		
		return decimalNumber;
	}
}
