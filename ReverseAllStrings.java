package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseAllStrings {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many string/s you want to reverse : ");
		int n = Integer.parseInt(br.readLine());
		
		String[] sarray = new String[n];
		
		for(int i=0; i<sarray.length; i++)
		{
			System.out.println("Enter "+(i+1)+" String : ");
			sarray[i]=br.readLine();
		}
		
		for(int i=0; i<sarray.length; i++)
		{
			sarray[i]=reverseString(sarray[i]);
		}
		
		System.out.println("Reverse Strings Are : ");
		
		for(int i=0; i<sarray.length; i++)
		{
			System.out.println(sarray[i]);
		}
		
	}
	
	public static String reverseString(String temp)
	{
		String t = temp;
		int j;
		char c;
		char[] tarray = t.toCharArray();
		
		for(j=0; j<tarray.length; j++);
		--j;
		
		
		for(int i=0; i<j; i++,j--)
		{
			c = tarray[i];
			tarray[i] = tarray[j];
			tarray[j] = c;
			
		}
		
		t = new String(tarray);
		return t;
	}

}
