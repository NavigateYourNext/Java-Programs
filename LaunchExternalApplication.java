package JavaPrograms;

import java.io.IOException;

public class LaunchExternalApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Example-1
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("notepad.exe");
		Thread.sleep(1000);
		process.destroy();
		
		//Example-2
		process = runtime.exec("notepad.exe C:/Users/abasakk/eclipse-workspace/PractiseJavaPrograms/src/JavaPrograms/sample.txt");
		Thread.sleep(1000);
		process.destroy();
		
		//Example-3
		String[] cmdArray = new String[] {"C:/Program Files/Google/Chrome/Application/chrome.exe","https://www.Amazon.com"};
		process = runtime.exec(cmdArray);
		Thread.sleep(10000);
		process.destroy();
		
	}

}
