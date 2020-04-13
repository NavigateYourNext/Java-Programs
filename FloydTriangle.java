package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FloydTriangle {

	public static void main(String[] args)throws Exception {
		int i,j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many lines :");
		int no = Integer.parseInt(br.readLine());
		
		int num=1;
		for(i=1; i<=no; i++)
		{
			System.out.println();
			//num=1;
			for(j=1; j<=i; j++)
			{
				System.out.print(num+" ");
				num++;
			}
		}

	}

}
