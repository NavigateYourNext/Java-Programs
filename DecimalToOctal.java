package JavaPrograms;

public class DecimalToOctal {

	public static void main(String[] args) {
		
		System.out.println(convertToOctal(78));
		

	}
	
	public static long convertToOctal(long number)
	{
		long octalNumber = 0;
		long i=1;
		while(number != 0)
		{
			octalNumber+=(number%8)*i;
			number/=8;
			i*=10;
		}
		
		return octalNumber;
	}

}
