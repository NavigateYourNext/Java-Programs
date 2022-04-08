package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class SquaresAndAverage {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,222,234,567,890,432,236,211,22);
		
		double average = numbers.stream().map(e -> e*e).mapToInt(e -> e).average().getAsDouble();
		System.out.println(average);
		
	}

}
