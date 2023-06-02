package exercises;

import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args)
	{
		System.out.println("What is the message?");
		
		Scanner keyboard = new Scanner (System.in);
		String message = keyboard.nextLine();
		
		System.out.println("\nThe message is "+"\""+message+"\".");
		
	}

	
}
