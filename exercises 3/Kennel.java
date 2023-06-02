package exercises;

public class Kennel 
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog("Astro", 4);
		Dog dog2 = new Dog("Baxter", 2);
		
		System.out.println(dog1 + "\nDog's age in human years: " + dog1.inPersonYears());
		System.out.println(dog2 + "\nDog's age in human years: " + dog2.inPersonYears());
		
	}
}