package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindWordsInAString {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A String : ");
		String s = br.readLine();

		char[] stringArray = s.toCharArray();

		int words = calculateWords(stringArray);

		System.out.println("Total No.Of.Words Are : "+words);
	}

	public static int calculateWords(char[] stringArray)
	{
		int count = 0;
		boolean word = false;

		for(int i=0; i<stringArray.length; i++)
		{
			if(stringArray[i] == '\n' || stringArray[i] == '.' || stringArray[i] == '\t' || stringArray[i] == '\r' || stringArray[i] == ' ')
			{
				word = false;
			}
			else if(word == false)
			{
				count = count+1;
				word = true;
			}
		}




		return count;
	}

}
