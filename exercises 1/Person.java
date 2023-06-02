package exercises;

import java.util.Scanner;

public class Person 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		
		System.out.print("Birthday: ");
		String DOB = keyboard.nextLine();
		
		System.out.print("Interest: ");
		String interest = keyboard.nextLine();
		
		System.out.print("Favorite book: ");
		String book = keyboard.nextLine();
		
		System.out.print("Favorite film: ");
		String film = keyboard.nextLine();
	}
}
