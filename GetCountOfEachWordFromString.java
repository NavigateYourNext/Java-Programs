package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class GetCountOfEachWordFromString 
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A String : ");
		String s = br.readLine();
		
		s = s.toLowerCase();
		
		String[] splitString = s.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer> ();
		int count = 1;
		
		
		for(int i=0 ;i<splitString.length; i++)
		{
			if(hm.containsKey(splitString[i]))
			{
				hm.put(splitString[i].toLowerCase(), hm.get(splitString[i])+1);
			}
			else
			{
				hm.put(splitString[i].toLowerCase(), count);
			}
		}
		
		System.out.println("Please find below count of each word :");
		
		for(Entry<String,Integer> e : hm.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
