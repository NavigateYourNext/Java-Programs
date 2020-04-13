package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers you want to sort : ");
		int no = Integer.parseInt(br.readLine());
		
		int[] arr = new int[no];
		
		System.out.println("Please enter that "+no+" numbers");
		for(int i=0; i<no; i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		System.out.println("After sorting numbers are : ");
		
		bubblesort(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	

	}
	
	public static void bubblesort(int[] arr)
	{
		int temp;
		for(int i=1; i<=arr.length; i++)
		{
			for(int j=0; j<arr.length-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		}

}

