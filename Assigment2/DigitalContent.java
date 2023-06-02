/***
 * 
 * James Duong
 * 20119772
 * ENSE602/01A
 * Assessment Part B
 * 
 **/

package Assigment2;

public abstract class DigitalContent implements Comparable<DigitalContent>
{
	// Variables
	private String title;
	private String publisher;
	private String release;
	
	// 3 input constructor
	public DigitalContent(String title, String publisher, String release)
	{
		this.title = title;
		this.publisher = publisher;
		this.release = release;
	}

	// Sets title
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	// Sets publisher
	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}
	
	// Sets release date
	public void setRelease(String release) 
	{
		this.release = release;
	}
	
	// Returns title
	public String getTitle() 
	{
		return this.title;
	}
	
	// Returns publisher
	public String getPublisher() 
	{
		return this.publisher;
	}
	
	// Returns release date
	public String getRelease() 
	{
		return this.release;
	}
	
	// Returns content description
	@Override
	public String toString() 
	{
		return "Title: " + this.title + ", Publisher: " + this.publisher + ", Release Date: " + this.release;
	}
	
	// Checks the user inputed query to find any matching digital content
	public boolean match(String query)
	{
		if(title.toLowerCase().contains(query.toLowerCase()) || publisher.toLowerCase().contains(query.toLowerCase()) 
				|| release.toLowerCase().contains(query.toLowerCase()))
			return true;
		
		return false;
	}
	
	// Compares titles of digital content to be sorted
	public int compareTo(DigitalContent contents)
	{
		return title.compareTo(contents.title);
	}
}

