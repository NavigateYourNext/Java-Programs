package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Rows & Columns of 1st Array: ");
			int rows1 = Integer.parseInt(br.readLine());
			int columns1 = Integer.parseInt(br.readLine());
			int[][] firstArray = new int[rows1][columns1];
			
			System.out.println("Enter Rows & Columns of 2nd Array: ");
			int rows2 = Integer.parseInt(br.readLine());
			int columns2 = Integer.parseInt(br.readLine());
			
			if(rows2!=columns1){
				System.out.println("Column count of first array should be matched with Row count of second array to perform Multiplication of Matrices");
				System.exit(0);
			}
			
			int[][] secondArray = new int[rows2][columns2];
			
			System.out.println("Enter elements of first matrix with "+rows1+" rows and "+columns1+" columns:");
			for(int i=0; i<rows1; i++) {
				for(int j=0; j<columns1; j++) {
					firstArray[i][j]=Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("Enter elements of second matrix with "+rows2+" rows and "+columns2+" columns:");
			for(int i=0; i<rows2; i++) {
				for(int j=0; j<columns2; j++) {
					secondArray[i][j]=Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("First Matrix is: ");
			for(int[] first:firstArray)
				System.out.println(Arrays.toString(first));
			System.out.println("Second Matrix is: ");
			for(int[] second:secondArray)
				System.out.println(Arrays.toString(second));
			System.out.println("Multiplication of Matrices are: ");
			for(int[] resultArray:multiplicationOfMatrix(firstArray,secondArray))
				System.out.println(Arrays.toString(resultArray));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static int[][] multiplicationOfMatrix(int[][] firstArray, int[][] secondArray){
		int[][] resultArray = new int[firstArray.length][secondArray[0].length];
		for(int i=0; i<firstArray.length; i++){
			for(int j=0; j<secondArray[0].length; j++){
				for(int k=0; k<secondArray.length; k++) {
					resultArray[i][j] += firstArray[i][k] * secondArray[k][j];
				}
			}
			
		}
		return resultArray;
	}

}
