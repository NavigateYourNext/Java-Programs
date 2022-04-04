package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatNumbersCount {

	public static void main(String[] args) {
		
		long number = 1234323;
		getCountOfEachNumber(number);
	}
	
	public static void getCountOfEachNumber(long number) {
		Map<Long,Integer> countMap = new HashMap<Long,Integer> ();
		long temp = number;
		long rem=0;
		while(temp!=0) {
			rem = temp%10;
			if(!countMap.containsKey(rem)) {
				countMap.put(rem, 1);
			}else {
				countMap.put(rem,countMap.get(rem)+1);
			}
			temp=temp/10;
		}
		
		System.out.println(countMap);
		
		for(Entry<Long,Integer> e:countMap.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
	}

}
