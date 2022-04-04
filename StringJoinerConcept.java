package JavaPrograms;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(",", "[", "]");
		
		joiner = joiner.add("Akshay").add("Pradip").add("Shete");
		
		System.out.println(joiner.toString());
	}

}
