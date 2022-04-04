package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	private String name;
	private int rollNum;
	private int marks;
	private int age;
	
	public String getName() {
		return name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	public Student(String name, int rollNum, int marks, int age) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", marks=" + marks + ", age=" + age + "]";
	}
}

public class FindStudentMarks {

	public static void main(String[] args) {
		
		Student s1 = new Student("Akshay",1,97,25);
		Student s2 = new Student("Pradip",2,96,28);
		Student s3 = new Student("Shete",3,95,24);
		Student s4 = new Student("Pune",4,94,20);
		
		List<Student> studentList = new ArrayList <Student> ();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		studentList.forEach(s -> System.out.println(s));	
		System.out.println("------------------------------------------------------");
		
		studentList.stream().filter(x -> x.getMarks() >= 95).forEach(e -> System.out.println(e.getName()));
		System.out.println("------------------------------------------------------");
		studentList.stream().filter(x -> x.getMarks() >= 95).map(Student::getMarks).forEach(e -> System.out.println(e));
		System.out.println("------------------------------------------------------");
		int maximumMarks = studentList.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		System.out.println(maximumMarks);
		studentList.stream().filter(e -> e.getMarks() == maximumMarks).forEach(e -> System.out.println(e.getName()));
	}

}
