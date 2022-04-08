package JavaPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinNumber {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(4,5,1,3,0);
		int max = lst.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		System.out.println("--------------------");
		int min = lst.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}

}
