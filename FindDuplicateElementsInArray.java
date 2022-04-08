package JavaPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		
		String[] data = {"Google","Amazon","Azure","Microsoft","Azure","Google"};
		
		// *** Brute Force Mechanism ***
		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i].equalsIgnoreCase(data[j])) {
					System.out.println(data[j]);
				}
			}
		}
		
		System.out.println("----------------------------------------");
		
		// *** HashSet ***
		Set<String> newSet = new HashSet<String> ();
		for(String e:data) {
			if(!newSet.add(e)) {
				System.out.println(e);
			}
		}
		
		System.out.println("----------------------------------------");
		
	    // *** Streams ***
		Set<String> dataSet = new HashSet<String> ();
		List<String> newList = Arrays.asList(data);
		newList.stream().filter(e -> !dataSet.add(e)).forEach(e -> System.out.println(e));
	}

}
