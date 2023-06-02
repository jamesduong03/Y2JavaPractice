package exercises;

import java.util.Scanner;

public class TimeDuration 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the number of hours");
		int hours = keyboard.nextInt();
		int sec1 = hours*(60*60);
		
		System.out.println("Enter the number of minutes");
		int min = keyboard.nextInt();
		int sec2 = min*60;
		
		System.out.println("Enter the number of seconds");
		int sec3 = keyboard.nextInt();
		
		int total = (sec1 + sec2 + sec3);
		
		System.out.println("The total number of seconds is " + total);
	}
		
}
