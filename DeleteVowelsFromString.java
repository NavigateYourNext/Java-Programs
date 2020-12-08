package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class DeleteVowelsFromString {

	static List<String> list = new ArrayList<String>();


	public static void main(String[] args)
	{
		String s = "aeiou akshay shete aou";
		String[] splitString = s.split("[\\s]");
		String newString = "";

		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		list.add("a");
		list.add("e");
		list.add("i");
		list.add("o");
		list.add("u");


		for(String str:splitString)
		{
			if(checkAllVowels(str))
				newString+=str.concat(" ");
			else
				newString += removeVowels(str).concat(" ");
		}

		System.out.println(newString);

	}
	
	public static boolean checkAllVowels(String str)
	{
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(list.contains(String.valueOf(str.charAt(i))))
				count++;
		}
		
		if(count == str.length())
			return true;
		else 
			return false;
	}

	public static String removeVowels(String str)
	{
		String result = "";

		StringBuffer sb = new StringBuffer(str);

		for(int i=0; i<str.length()-1; i++)
		{
			char c = str.charAt(i);

			if(list.contains(String.valueOf(c)))
			{
				if(str.length() != i+1)
				  sb = sb.deleteCharAt(i);
				else
					result+=String.valueOf(c);
									
			}
			else
			{
				sb = new StringBuffer(str);
				result+=(sb.substring(i,i+1)).toString();
			}
		}
		
		if(!list.contains(String.valueOf(str.charAt(str.length()-1))))
			result+=str.substring(str.length()-1, str.length());
		
		
		return result;
	}



}
