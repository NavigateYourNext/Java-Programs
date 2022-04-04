package JavaPrograms;

public class ReverseNumberUsingRecursion {

	public static void main(String[] args) {
		
		int number = 1023;	
		reverse(number);
	}
	
	public static void reverse(int number) {
		if(number < 10) {
			System.out.print(number);
		}else {
			System.out.print(number%10);
			reverse(number/10);
		}
	}
	

}
