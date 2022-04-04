package JavaPrograms;

public class StarPyramidPattern {

	public static void main(String[] args) {

		int lineNumber = 5;
		for(int i=0; i<lineNumber; i++) {
			System.out.println();
			for(int j=lineNumber-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" *");
			}
		}

	}

}
