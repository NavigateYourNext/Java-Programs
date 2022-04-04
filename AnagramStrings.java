package JavaPrograms;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {

		String data1 = "LISTEN";
		String data2 = "silent";

		char[] data1Array = data1.toLowerCase().toCharArray();
		char[] data2Array = data2.toLowerCase().toCharArray();
		
		if(data1.length() == data2.length()) {
			Arrays.sort(data1Array);
			Arrays.sort(data2Array);

			boolean result = Arrays.equals(data1Array,data2Array);
			if(result)
			  System.out.println("Strings are anagrams !!");
			else
				System.out.println("Strings are not anagrams !!");
		}else {
			System.out.println("Strings are not anagrams !!");
		}

	}
}
