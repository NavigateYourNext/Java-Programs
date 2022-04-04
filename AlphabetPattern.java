package JavaPrograms;

/**
 * A
 * B B
 * C C C
 * D D D D
 * F F F F F
 * @author ABASAKK
 *
 */
public class AlphabetPattern {

	public static void main(String[] args) {
		
		int lineNumber = 5;
		int var = 65;
		for(int i=0; i<5; i++) {
			System.out.println("");
			for(int j=0; j<=i; j++) {
				System.out.print((char)var+" ");
			}
			var++;
		}

	}

}
