package JavaPrograms;

public class GetOccurenceOfChars {

	public static void main(String[] args) {
		
		String s = "AAbbCcDeFedE";
		
		long count = s.chars().filter(e -> (char)e == 'A' || (char)e == 'e').count();

		System.out.println(count);
	}

}
