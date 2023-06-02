/***
 * 
 * James Duong
 * 20119772
 * ENSE602/01A
 * Assessment Part B
 * 
 **/

package Assigment2;

import java.util.Scanner;
import java.util.ArrayList;


// Play interface
interface Play
{
	public DigitalContent getCurrentStream();
	
	public void stream(String query);
	
	public void stop();
}

public class Client implements Play 
{
	// Variables
	private StreamingService streaming;
	private DigitalContent currentlyStreaming;

	// 2 input constructor
	public Client(StreamingService streamingService) 
	{
		this.streaming = streamingService;
		this.currentlyStreaming = null;
    }

	// Returns currentlyStreaming that is set to null
	public DigitalContent getCurrentStream() 
	{
		return this.currentlyStreaming;
	}

	// Sets currentlyStreaming to matched query
    public void stream(String query)
    {
    	ArrayList<DigitalContent> matchingContent = streaming.match(query);
    	if (!matchingContent.isEmpty()) 
    	{
    		currentlyStreaming = matchingContent.get(0);
    		System.out.println("Now Streaming: " + currentlyStreaming);
    	} 
    	else 
    	{
    		System.out.println("No matching content found.");
    	}
    }

    // Sets currentlyStreaming to null
    public void stop() 
    {
    	currentlyStreaming = null;
    }

    public static void main(String[] args) 
    	{
    	
    	
    	StreamingService streaming = new StreamingService();
    	Client client = new Client(streaming);
    	Scanner input = new Scanner(System.in);

    	// Creating Film objects
    	Film ironMan = new Film("Iron Man", "Marvel Studios", "2008", "Robert Downey Jr, Jon Favreau");
        Film captainAmerica = new Film("Captain America: The First Avenger", "Marvel Studios", "2011", "Chris Evans, Sebastian Stan");
        Film spiderman = new Film("Spider-Man: Homecoming", "Marvel Studios", "2017", "Tom Holland, Zendaya");
        Film avengers = new Film("The Avengers", "Marvel Studios", "2012", "Robert Downey Jr, Chris Evens");
        Film blackPanther = new Film("Black Panther", "Marvel Studios", "2018", "Chadwick Boseman, Michael B. Jordan");
        
        // Creating Music objects
        Music war = new Music("War With Heaven", "Island Records", "2021", "Keshi");
        Music like = new Music("Like me", "H1ghr Music", "2019", "pH-1");
        Music nos = new Music("nostalgia", "MauveLabel", "2021", "JUNNY, JAY B");
        Music home = new Music("Way Back Home", "DCTOM", "2018", "SHAUN");
        Music lilac = new Music("Lilac", "Ambition Musik", "2018", "CHANGMO, CHOI JUNG HOON");
        
        
        // Adding Film and Music objects to array for streaming service
        streaming.add(ironMan);
        streaming.add(captainAmerica);
        streaming.add(spiderman);
        streaming.add(avengers);
        streaming.add(blackPanther);
        
        streaming.add(war);
        streaming.add(like);
        streaming.add(nos);
        streaming.add(home);
        streaming.add(lilac);
        
        
        // While loop to get repeat menu unit program is stopped
        while (true) {
            System.out.println("Menu:");
            System.out.println("A. Display Digital Content library");
            System.out.println("B. Display currently streaming Digital Content");
            System.out.println("C. Match Digital Content to Stream");
            System.out.println("D. Stop streaming");
            System.out.println("E. Quit Client Application");
            System.out.print("Please enter an option: ");

            String option = input.nextLine().toLowerCase();

            // switch to get menu option of user input
            switch (option) 
            {
                case "a":
                    System.out.println("\nDigital Content library:");
                   System.out.println(streaming);
                    break;
                    
                case "b":
                    System.out.println("\nCurrently streaming:");
                    if (client.getCurrentStream() != null)
                    {
                        System.out.println(client.getCurrentStream());
                        System.out.print("\n");
                    }
                    else 
                    {
                        System.out.println("Nothing is currently streaming\n");
                    }
                    break;
                    
                case "c":
                    System.out.print("\nWhat would you like to stream: ");
                    String query = input.nextLine();
                    client.stream(query);
                    System.out.print("\n");
                    break;
                    
                case "d":
                    client.stop();
                    System.out.println("\nStreaming stopped\n");
                    break;
                    
                case "e":
                    System.out.println("\nQuitting Client App");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("\nInvalid option. Please try again\n");
                    break;
            }
        }
    }
}
