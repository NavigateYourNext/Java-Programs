package JavaPrograms;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		try {
			long number = 1011;
			
			boolean result = true;
			long rem = 0;
			long temp = number;
			while(temp!=0) {
				rem = temp % 10;
				if(rem > 1) {
					result = false;
					break;
				}else {
					temp = temp / 10;
				}
			}
			if(result) {
				System.out.println(number+" is a binary number");
			}else {
				System.out.println(number+" is not a binary number");
			}
			
			//We can also use RE to check this.
			//String.valueOf(number).matches("[0-1]+");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
