package exercises;

public class Dog 
{
	String name;
	int age;
	
	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	public void setAge (int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public int inPersonYears()
	{
		return this.age*7;
	}
	
	public String toString()
	{
		return "Dog's name: " + this.name + "\nDog's age: " + this.age;
	}
	
}
