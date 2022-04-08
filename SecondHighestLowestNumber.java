package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40);
		int secondHighestNumber = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighestNumber);
		
		int secondLowestNumber = list.stream().sorted().distinct().skip(1).findAny().get();
		System.out.println(secondLowestNumber);
		
	}

}
