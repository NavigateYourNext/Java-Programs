package JavaPrograms;

import java.util.function.IntPredicate;

public class VowelsCount {

	public static void main(String[] args) {
		
		String s = "aeiouAEIOU";
		
		IntPredicate vowel = new IntPredicate() {
			@Override
			public boolean test(int t) {
				return t=='a' || t=='e' || t=='i' || t=='o' || t=='u' || t=='A' || t=='E' || t=='I' || t=='O' || t=='U' ;
			}
		};
		
		long vowelCount = s.chars().filter(vowel).count();
		System.out.println(vowelCount);

	}

}
