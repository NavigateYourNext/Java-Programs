package JavaPrograms;

public class GetOccurenceOfChars2 {

	public static void main(String[] args) {
		
		String s = "I love coding and testing";
		long count = s.chars().mapToObj(e -> String.valueOf((char)e)).filter(e -> e.equals("i")).count();
		System.out.println(count);
	}

}
