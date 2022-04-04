package JavaPrograms;

import java.io.File;

public class SetFilePermissions {

	public static void main(String[] args) {
		
		File file = new File("/PractiseJavaPrograms/src/JavaPrograms/sample.txt");
		file.setReadable(true);
		file.setWritable(true);
		file.setExecutable(true);
		System.out.println("Done");
		
	}

}
