package JavaPrograms;

/**
 *   *****
 *   ****
 *   ***
 *   **
 *   *
 *   
 * @author ABASAKK
 *
 */
public class PrintReverseStars {

	public static void main(String[] args) {
		
		int lineNumber = 5;
		for(int i=0; i<=lineNumber ; i++){
			System.out.println();
			for(int j=lineNumber;j>=i;j--) {
				System.out.print("*");
			}
			
		}

	}

}
