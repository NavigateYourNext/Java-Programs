package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,222,234,567,890,432,236,211,22);
		numbers.stream().filter(e -> e%2 == 0).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("------------------------------");
		numbers.stream().filter(e -> e%2 != 0).collect(Collectors.toList()).forEach(e -> System.out.println(e));

	}

}
