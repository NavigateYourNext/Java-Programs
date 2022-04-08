package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,222,234,567,890,432,236,211,22);
		numbers.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList()).forEach(System.out::println);
		

	}

}
