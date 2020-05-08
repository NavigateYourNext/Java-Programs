package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbersBetweenInterval
{

	public static void main(String[] args)throws Exception 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Lower Number : ");
		int low = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Upper Number : ");
		int high = Integer.parseInt(br.readLine());
		
		System.out.println("All Prime Numbers Between "+low+" and "+high+" are as follows:");
		boolean flag = true;
		while(low <= high)
		{
			for(int i=2; i<=low/2; i++)
			{
				if(low%i == 0)
				{
					flag = false;
					break;
				}
				else
					flag = true;
			}
			
			if(flag)
				System.out.print(low+" ");
			low++;
		}
	}

}
