package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		
		//Get first 5 numbers - sum of 5 numbers
		
		int sum = list.stream().limit(5).reduce((p,q) -> p+q).get();
		System.out.println(sum);
	}

}
