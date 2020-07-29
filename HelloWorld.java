package JavaPrograms;

import java.util.HashSet;

class Student
{
	int sid = 100;
	
	 class StudentDes
	{
		int sid=200;
		
		public void display()
		{
			System.out.println("StudentDes: "+sid);
		}
	}
	
	public void display()
	{
		System.out.println("Student: "+sid);
	}
}

public class HelloWorld {

	public static void main(String[] args)
	{

		Student s = new Student();
		s.display();
		
		Student.StudentDes std =  s.new StudentDes();
		std.display();
		
		
		
	}



}
