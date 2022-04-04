package JavaPrograms;

import java.text.DecimalFormat;

public class FindPercentageOfCharacters {

	public static void main(String[] args) {
			
		String data = "Java Programs 100 #$%@";
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitsCount=0;
		int specialCharsCount=0;
		
		for(int i=0; i<data.length(); i++) {
			char ch = data.charAt(i);
			if(Character.isUpperCase(ch))
				upperCaseCount++;
			else if(Character.isLowerCase(ch))
				lowerCaseCount++;
			else if((Character.isDigit(ch)))
				digitsCount++;
			else
				specialCharsCount++;
		}
		
		double upperCasePercentage=(upperCaseCount*100.0)/data.length();
		double lowerCasePercentage=(lowerCaseCount*100.0)/data.length();
		double digitsPercentage=(digitsCount*100.0)/data.length();
		double specialCharsPercentage=(specialCharsCount*100.0)/data.length();
		
		DecimalFormat decimalFormatter = new DecimalFormat("##.##");
		
		System.out.println("UpperCase Percentage -> "+decimalFormatter.format(upperCasePercentage));
		System.out.println("LowerCase Percentage -> "+decimalFormatter.format(lowerCasePercentage));
		System.out.println("Digits Percentage -> "+decimalFormatter.format(digitsPercentage));
		System.out.println("SpecialChars Percentage -> "+decimalFormatter.format(specialCharsPercentage));

	}

}
