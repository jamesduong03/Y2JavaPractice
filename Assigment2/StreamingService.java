/***
 * 
 * James Duong
 * 20119772
 * ENSE602/01A
 * Assessment Part B
 * 
 **/

package Assigment2;

import java.util.ArrayList;
import java.util.Collections;

public class StreamingService 
{
	// Variable
	private ArrayList <DigitalContent> content;
	
	// Constructor to get get empty array list
	public StreamingService()
	{
		content = new ArrayList<>();
	}
	
	// Adds contents to array for digital content
	public void add(DigitalContent contents)
	{
		if (content != null)
			content.add(contents);	
	}
	
	// Return matched content from given query
	public ArrayList <DigitalContent> match(String query)
	{
		ArrayList <DigitalContent> matchcontents = new ArrayList<>();
		for (DigitalContent item : content)
		{
			if(item.match(query))
				matchcontents.add(item);
		}
		
		return matchcontents;
	}
	
	// ToString to sort digital content by title
	@Override
    public String toString() {
        Collections.sort(content, (c1, c2) -> c1.getTitle().compareToIgnoreCase(c2.getTitle()));
        StringBuilder sb = new StringBuilder();
        for (DigitalContent content : content)
            sb.append(content).append("\n");
        
        return sb.toString();
    }
}
