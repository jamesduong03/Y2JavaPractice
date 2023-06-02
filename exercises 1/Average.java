package exercises;

import java.util.Scanner;

public class Average 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the first number");
		double num1 = keyboard.nextInt();
		
		System.out.println("Enter the second number");
		double num2 = keyboard.nextInt();
		
		System.out.println("Enter the third number");
		double num3 = keyboard.nextInt();
		
		System.out.println("\nThe average of the numbers is: "+((num1+num2+num3)/3));
	}
}
