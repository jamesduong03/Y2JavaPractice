package exercises;
import java.util.Scanner;

public class Student 
{
	String firstname;
	String lastname;
	String studentID;
	
	Student(String firstname, String lastname, String studentID)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentID = studentID;
	}
	
	Student(String firstname, String lastname)
	{	
		this(firstname, lastname, "?");
	}
		
	Student()
	{
		this("UNKNOWN", "UNKNOWN", "?");
	}
	
	public String toString()
	{
		return "First name: " + this.firstname + "\nLast name: " + this.lastname + "\nID: " + this.studentID;
	}
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("Please enter the student's first name:");
		String firstname = keyboard.nextLine();
		
		
		System.out.println("Please enter the student's last name:");
		String lastname = keyboard.nextLine();
		
		System.out.println("Please enter the student's ID:");
		String studentID = keyboard.nextLine();
		
		
		System.out.println("Calling 3 parameter constructor:");
		Student student = new Student(firstname, lastname, studentID);
		System.out.println("Student's fisrt name: " + student.firstname + " Last name: " + student.lastname + " ID: " + student.studentID);
		
		
		System.out.println("Calling 2 parameter constructor:");
		student = new Student(firstname, lastname);
		System.out.println("Student's fisrt name: " + student.firstname + " Last name: " + student.lastname + " ID: " + student.studentID);

		
		System.out.println("Calling zero parameter constructor:");
		student = new Student();
		System.out.println("Student's fisrt name: " + student.firstname + " Last name: " + student.lastname + " ID: " + student.studentID);

	}
}
