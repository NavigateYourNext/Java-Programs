package JavaPrograms;

/**
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * @author ABASAKK
 *
 */
public class AlphabetPattern2 {

	public static void main(String[] args) {
	
		int lineNumber = 5;
		
		
		for(int i=0; i<lineNumber;i++) {
			System.out.println();
			int var = 65;
			for(int j=0; j<=i; j++) {
				System.out.print((char)var+" ");
				var++;
			}
		}
	}

}
