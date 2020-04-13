package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Mobile Number (Without Country Code) : ");
		String mob = br.readLine();
		
		Pattern p = Pattern.compile("\\d{10}");
		Matcher m = p.matcher(mob);
		
		if(m.matches() == true)
		{
			System.out.println("Valid Mobile Number");
		}
		else
		{
			System.out.println("Invalid Mobile Number");
		}
		
		System.out.println("Enter Person Name :");
		String name = br.readLine();
		
		Pattern p1 = Pattern.compile("[A-z]+\\s[A-z]+");
		Matcher m1 = p1.matcher(name);
		
		if(m1.matches() == true)
		{
			System.out.println("Valid Name");
		}
		else
		{
			System.out.println("Invalid Name");
		}
		

	}

}
