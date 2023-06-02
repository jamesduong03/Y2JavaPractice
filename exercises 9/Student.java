package exercises;

public class Student 
{
	String name;
	static String id;
	
	public Student(String name, String id)
	{
		this.name = name;
		Student.id = id;
	}
	
	public boolean equals (Object id)
	{
		return true;
	}
	
	public String toString()
	
	{
		return this.name + ", " + Student.id;
	}
	
	public static void main(String[] args)
	{
		Student stu1 = new Student("James Duong", "20119772");
		
		System.out.println(stu1.toString());
		
		System.out.println(id.equals("20119772"));
	}
	
}
