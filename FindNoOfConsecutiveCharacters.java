package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindNoOfConsecutiveCharacters {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A String : ");
		
		String s = br.readLine();
		
		int count = findConsChar(s);
		
		System.out.println("Total no of consequtive characters are : "+count);

	}
	
	public static int findConsChar(String s)
	{
		int count = 0;
		char[] sarray = s.toCharArray();
		
		for(int i=0; i<sarray.length-1; i++)
		{
			if(sarray[i] == sarray[i+1])
			{
				count++;
			}
		}
		
		
		
		return count;
	}

}
