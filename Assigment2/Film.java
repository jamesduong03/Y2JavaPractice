/***
 * 
 * James Duong
 * 20119772
 * ENSE602/01A
 * Assessment Part B
 * 
 **/

package Assigment2;

public class Film extends DigitalContent
{
	// Variable
	private String cast;

	// 4 input constructor
	public Film(String title, String publisher, String release, String cast)
	{
		super(title, publisher, release);
		this.cast = cast;
	}
	
	// Sets cast
	public void setCast(String cast) 
	{
		this.cast = cast;
	}
	
	// Returns cast
	public String getCast() 
	{
		return this.cast;
	}

	// Returns toString from DigitalContent using super and adding cast
	public String toString()
	{
		return super.toString() + ", Cast: " + this.cast;
	}
	
	
	//Checks the user inputed query to find any matching digital content using super and also checking for cast
	@Override
	public boolean match(String query)
	{
		return super.match(query) || cast.toLowerCase().contains(query.toLowerCase());
	}
}
