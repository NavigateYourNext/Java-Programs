package JavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class GetCountOfFileData {

	public static void main(String[] args) {
		try {
			int charCount=0;
			int wordCount=0;
			int lineCount=0;

			BufferedReader br = new BufferedReader(new FileReader("C:/Users/abasakk/eclipse-workspace/PractiseJavaPrograms/src/JavaPrograms/sample.txt"));
			String currentLine=br.readLine().trim();
			while(currentLine!=null){
				lineCount++;
				
				String[] wordsArray = currentLine.split(" ");
				wordCount+=wordsArray.length;
				
				for(String chars:wordsArray)
					charCount+=chars.length();

				currentLine = br.readLine();
			}
			
			System.out.println("Line Count: "+lineCount);
			System.out.println("Word Count: "+wordCount);
			System.out.println("Characters Count: "+charCount);

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
