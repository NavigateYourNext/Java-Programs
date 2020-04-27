package JavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please specify size of an array: ");
			int size = Integer.parseInt(br.readLine());

			int[] sorting = new int[size];

			System.out.println("Please enter "+size+" elements one by one:");
			for(int i=0; i<size; i++)
				sorting[i] = Integer.parseInt(br.readLine());

			System.out.println("Enter element to search: ");
			int searchNo = Integer.parseInt(br.readLine());

			System.out.println("Do you want to sort the array (Y/N) ?");
			char c = (char) br.read();

			if(c == 'Y' || c == 'y')
				Arrays.sort(sorting);
			else
				throw new ArrayNotSortedException();

			int index = binarySearch(sorting,searchNo,0,size-1);

			if(index == -1)
				System.out.println(searchNo+" not found");
			else
				System.out.println(searchNo+" found at position: "+index);


		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ArrayNotSortedException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public static int binarySearch(int sorting[], int searchNo, int low, int high)
	{
		while(low <= high)
		{
			int mid = low+(high-low)/2;

			if(sorting[mid] == searchNo)
				return mid+1;
			if(searchNo < sorting[mid])
				high = mid - 1;
			if(searchNo > sorting[mid])
				low = mid + 1;


		}

		return -1;
	}

}
