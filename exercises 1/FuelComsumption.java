package exercises;

import java.util.Scanner;


public class FuelComsumption 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the number of miles:");
		float miles = keyboard.nextFloat();
		
		System.out.println("Enter the gallons of fuel used:");
		float fuel = keyboard.nextFloat();
		
		double MPG = miles/fuel;
		
		System.out.println("Miles Per Gallon: " + MPG);
	}
}
