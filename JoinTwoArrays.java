package JavaPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {
		
		String[] batsman = {"Rohit","Rahul","Virat"};
		String[] bowler = {"Jasprit", "Shardul", "Ashwin"};
		
		Stream<String> batsmanStream = Arrays.stream(batsman);
		Stream<String> bolwerStream = Arrays.stream(bowler);
		
		String[] fullTeam = Stream.concat(batsmanStream,bolwerStream).toArray(size -> new String[size]);
		System.out.println(Arrays.toString(fullTeam));
	}

}
