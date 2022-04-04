package JavaPrograms;

import java.util.Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		Double average = Arrays.stream(number).average().getAsDouble();
		System.out.println(average);
		
		//Get Maximum number from Array
		System.out.println(Arrays.stream(number).max().getAsInt());
		
		//Get Minimum number from Array
		System.out.println(Arrays.stream(number).min().getAsInt());
	}

}
