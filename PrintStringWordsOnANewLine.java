package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintStringWordsOnANewLine {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A String : ");
		String s = br.readLine();
		
		char[] stringArray = s.toCharArray();
		
		printOnNewLine(stringArray);

	}
	
	public static void printOnNewLine(char[] stringArray)
	{
		String temp = new String();
		for(int i=0; i<stringArray.length; i++)
		{
			if(stringArray[i] == '\n' || stringArray[i] == '.' || stringArray[i] == '\t' || stringArray[i] == '\r' || stringArray[i] == ' ')
			{
				System.out.println(temp);
				temp = new String();
			}
			else
				temp = temp + stringArray[i];
		}
		
		System.out.println(temp);
	}

}
