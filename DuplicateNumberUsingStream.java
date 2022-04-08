package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberUsingStream {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(4,5,1,3,0,1,2,3,4,5);
		lst.stream().filter(e -> Collections.frequency(lst, e) > 1).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
