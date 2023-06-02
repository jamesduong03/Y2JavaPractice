/***

 * 

 * James Duong

 * 20119772

 * ENSE602/01A

 * Assessment Part A

 * 
 **/
package Assignment1;

import java.util.Scanner;

public class ShopApp 
{
	// Variables
	private Product[] inventory = new Product[5];
	private static OnlineShop onlineshop = new OnlineShop();
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Adding products to array
		Product p1 = new Product("IPhone 14 Pro Max", "Apple", 2500);
		onlineshop.addProduct(p1);
		Product p2 = new Product("Galaxy S23 Ultra", "Samsung", 2300);
		onlineshop.addProduct(p2);
		Product p3 = new Product("Find N2 Flip", "Oppo", 1600);
		onlineshop.addProduct(p3);
		Product p4 = new Product("Macbook Pro 14", "Apple", 3000);
		onlineshop.addProduct(p4);
		Product p5 = new Product("IPad Air", "Apple", 1500);
		onlineshop.addProduct(p5);
		
		
		do 
		{
			System.out.println("Please choose one of the options:\n" +
								"A. Display inventory\n" +
								"B. Rate Product\n" +
								"C. Exit");
			
			char option = keyboard.next().charAt(0);
			
			// if statements to output user input
			if (option == 'A' || option == 'a')
			{
				System.out.println("\nProducts: ");
				System.out.println(onlineshop.toString());
			}
			
			if (option == 'B' || option == 'b')
			{
				System.out.println("\nProducts: ");
				System.out.println(onlineshop.toString());
				System.out.print("Please select a product to rate: ");
				ShopApp.rateProduct();
			}
			
			if (option == 'C' || option == 'c')
			{
				System.out.println("Thank you for visiting. Please come again!");
				System.exit(0);
			}
			
		}
		while(true);
			
	}

	// Function to rate chosen product
	public static void rateProduct() 
	{
		// Get user input
		Scanner keyboard = new Scanner(System.in);
		int option = keyboard.nextInt();
		
		// Get user rating
		System.out.println("Enter a rating between 0.0 to 5.0");
		double rating = keyboard.nextDouble();
			
			// do while loop for input ratings outside of 0 and 5
			do
			{
				if (rating >= 0.0 && rating <= 5.0)
				{
					onlineshop.products(option).ReliabilityRating(rating);
			
					System.out.println("The new rating is:");
					System.out.print(OnlineShop.products(option));
					System.out.println("Thank you for rating this product.\n");
					break;
				}
				else
				{
					System.out.println("Please enter a rating between 0.0 to 5.0");
					rating = keyboard.nextDouble();
			
				}
			}while (rating >= 0.0 && rating <= 5.0);
	}
}