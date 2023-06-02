/***

 * 

 * James Duong

 * 20119772

 * ENSE602/01A

 * Assessment Part A

 * 
 **/

package Assignment1;

public class OnlineShop 
{
	
	// Variables
	private static Product[] inventory;
	private int nProduct;
	
	// Constructor to initialise variables
	public OnlineShop()
	{
		this.inventory = new Product[5];
		this.nProduct = 0;
	}
	
	// Function to add products to array
	public void addProduct(Product newproduct)
	{
		if(this.nProduct < 5)
		{
			this.inventory[this.nProduct++] = newproduct;
		}
	}
	
	
	// Function to output products in inventory
	public String toString()
	{
		String output = "";
		int num = 1;
		for (Product product : this.inventory)
		{
			output += (num++) + " " + product;
		}
		return output;
	}
	
	// Function to return user selected product
	public static Product products(int select)
	{
		if (select >=1 && select <= 5)
		{
			return inventory[select - 1];
		}
		else
		{
			return null;
		}
	}
}
