package JavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileContent {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/abasakk/eclipse-workspace/PractiseJavaPrograms/src/JavaPrograms/copy1.txt"));
			FileWriter fr = new FileWriter(new File("C:/Users/abasakk/eclipse-workspace/PractiseJavaPrograms/src/JavaPrograms/copy2.txt"));
			
			String fileData = br.readLine();
			while(fileData!=null) {
				fr.write(fileData+"\n");
				fileData=br.readLine();
			}
			fr.close();
			br.close();
			System.out.println("File copied successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
