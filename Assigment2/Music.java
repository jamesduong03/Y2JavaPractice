/***
 * 
 * James Duong
 * 20119772
 * ENSE602/01A
 * Assessment Part B
 * 
 **/

package Assigment2;

public class Music extends DigitalContent
{
	// Variable
	private String artist;
	
	// 4 input constructor
	public Music (String title, String publisher, String release, String artist)
	{
		super(title, publisher, release);
		this.artist = artist;
	}

	// Sets artist
	public void setArtist(String artist) 
	{
		this.artist = artist;
	}
	
	// Returns artist
	public String getArtist() 
	{
		return this.artist;
	}
	
	// Returns toString from DigitalContent using super and adding artist
	public String toString()
	{
		return super.toString() + ", Artist: " + this.artist;
	}
	
	//Checks the user inputed query to find any matching digital content using super and also checking for artist
	@Override
	public boolean match(String query)
	{
		return super.match(query) || artist.toLowerCase().contains(query.toLowerCase());
	}
	
	
}
