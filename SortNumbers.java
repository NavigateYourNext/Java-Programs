package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(4,5,1,3,0);
		
		lst.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-------------------------------------");
		lst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
