/***

 * 

 * James Duong

 * 20119772

 * ENSE602/01A

 * Assessment Part A

 * 
 **/

package Assignment1;

public class Product 
{
	// Variables
	private String model;
	private String ManName;
	private double price;
	private double rating;
	private int NoOfCon;
	
	// 3 input constructor
	public Product(String model, String ManName, double price)
	{
		this.model = model;
		this.ManName = ManName;
		this.price = price;
		this.rating = 0;
		this.NoOfCon = 0;
	}
	
	// 2 input constructor
	public Product(String model, String ManName)
	{
		this.model = model;
		this.ManName = ManName;
		this.price = 0;
		this.rating = 0;
		this.NoOfCon = 0;
	}
	
	// Returns Model Name 
	public String getmodel()
	{
		return this.model;
	}
	
	// Returns Manufacturer’s Name
	public String getManName()
	{
		return this.ManName;
	}
	
	// Returns Retail Price
	public double getprice()
	{
		return this.price;
	}
	
	// Returns Reliability Rating
	public double getrating()
	{
		return this.rating;
	}
	
	// Returns Number of Consumers who rated the product
	public int getNoOfCon()
	{
		return this.NoOfCon;
	}
	
	
	// Function for calculating reliability rating
	public void ReliabilityRating(double newRating)
	{
		if (newRating >= 0 && newRating <= 5)
		{
			 this.rating = (this.rating * this.NoOfCon + newRating) / (this.NoOfCon + 1);
			 this.NoOfCon++;
		}
	}
	
	// Product description
	@Override
	public String toString()
	{
		return this.model +
				", " + this.ManName +
				", $" + this.price +
				", " + this.rating + " (Based on " + this.NoOfCon + " customer ratings)\n";
	}
}
