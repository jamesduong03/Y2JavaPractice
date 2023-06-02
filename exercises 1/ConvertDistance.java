package exercises;

import java.util.Scanner;

public class ConvertDistance 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the number of miles:");
		float miles = keyboard.nextFloat();
		
		double km = miles*1.609344;
		
		if(miles < 0)
		{
			System.out.println("Please enter a value greater than 0!");
		}
		else
		{
		System.out.println("The number of km is: "+ km);
		}
	}
}
