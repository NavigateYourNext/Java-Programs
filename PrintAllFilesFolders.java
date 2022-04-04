package JavaPrograms;

import java.io.File;
import java.util.Arrays;

public class PrintAllFilesFolders {

	public static void main(String[] args) {
		try {
			String path = "C:/Users/abasakk/eclipse-workspace/PractiseJavaPrograms/src/JavaPrograms";
			File file = new File(path);
			File[] fileArray = file.listFiles();
			Arrays.sort(fileArray);
			for(File fileName:fileArray) {
				if(fileName.isDirectory()) {
					System.out.println("Directory name is - "+fileName.getName());
				}else if(fileName.isFile()) {
					System.out.println("File name is - "+fileName.getName());
				}else {
					System.out.println("Not a directory or file");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
