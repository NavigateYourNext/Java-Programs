package JavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindStringsCountFromFile {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/abasakk/eclipse-workspace/PractiseJavaPrograms/src/JavaPrograms/sample.txt"));
			Map<String, Integer> dataCount = new HashMap<String, Integer>();
			String data = br.readLine();

			while(data!=null) {
				String[] dataArray = data.toLowerCase().split(" ");
				for(String eachString:dataArray) {
					if(!dataCount.containsKey(eachString)){
						dataCount.put(eachString, 1);
					}else {
						dataCount.put(eachString, dataCount.get(eachString)+1);

					}
				}
				data = br.readLine();
			}

			dataCount.forEach((k,v) -> System.out.println(k+":"+v));
			System.out.println("-------------------------------------------");
			Map<String,Integer> resultMap = new HashMap<String,Integer> ();
			
			dataCount
				.entrySet()
					.stream()
						.filter(entry -> entry.getValue() == Collections.max(dataCount.values()))
							.forEach(e -> resultMap.put(e.getKey(), e.getValue()));
			
			System.out.println(resultMap);				


		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
