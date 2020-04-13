package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoDimensionalArray {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How Many Rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		System.out.println("How Many Columns : ");
		int cols = Integer.parseInt(br.readLine());
		
		int[][] mat = new int[rows][cols];
		
		System.out.println("Please Enter Numbers :");
		
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Entered Matrix Is : ");
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
