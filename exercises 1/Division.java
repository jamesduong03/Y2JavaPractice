package exercises;

import java.util.Scanner;

public class Division 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter the numerator");
		int num = keyboard.nextInt();
		float num1 = (float) num;
		
		System.out.println("Please enter the denominator");
		int den = keyboard.nextInt();
		float den1 = (float) den;
		
		System.out.println("The input fraction is: "+ num + "/" + den);
		
		if (den < 1)
		{
			System.out.println("This quantity is undifined");
		}
		else
		{
			System.out.print("The decimal equivalence is: " + num1/den1);
		}
	}	
}
