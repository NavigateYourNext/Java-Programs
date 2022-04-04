package JavaPrograms;

class NumberFormatException extends Exception{
	public String toString() {
		return "java.lang.NumberFormatException";
	}
}

public class StringToIntegerConversion {

	public static void main(String[] args) {
		
		try {
			String data = "25";
			int number = 0;
			for(int i=0; i<data.length(); i++) {
				
				if((int)data.charAt(i)<48 || (int)data.charAt(i)>57)
					throw new NumberFormatException();
				
				number = number*10 + (int)data.charAt(i)-48;
			}
			System.out.println("Converted number from string is: "+number);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
