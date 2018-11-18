//******************************************************************
//  mySong.java
//  Author		Stellar Student
//	Date		1-20-12
//
//  Format text output using the Scanner class and escape sequences.
//******************************************************************

import java.util.Scanner;

public class mySong
{
		//========================================================
		//	Read character strings and display them.
		//========================================================
		public static void main (String[] args)
		{
			// Declare variables for user input
			String title, artist, line1, line2, line3, line4;

			// Declare and initialize variables for my text
			String myTitle = "The Golden Age";
			String myArtist = "The Asteroids Galaxy Tour";
			String myLine1 = "I wished I lived in the golden age";
			String myLine2 = "Giving it up on the Broadway stage";
;			String myLine3 = "Hang with the rats and smoke cigars";
			String myLine4 = "Have a break with Frank and count the stars";

			// Create scanner object
			Scanner input = new Scanner (System.in);

			// Display a header
			System.out.println ("**********************\nCHAPTER 2 HOMEWORK: DISPLAY SONG VERSE\n");

			// Display my song information
			System.out.println ("\nTitle: " + myTitle + "\nArtist: " + myArtist);

			System.out.println ("\n" + myLine1 + "\n\t" + myLine2 + "\n\t\t" + myLine3 + "\n\t\t\t" + myLine4);

			System.out.println ("\n" + myLine1 + "\n\t" + myLine2 + "\n\t" + myLine3 + "\n\t" + myLine4 + "\n");

			System.out.println ("\n\"" + myLine1 + "\n" + myLine2 + "\n" + myLine3 + "\n" + myLine4 +"\"");

			// Display a header
			System.out.println ("\n\n**********************\nDISPLAY YOUR SONG VERSE\ntype your song information below\n");

			// Input user song title
			System.out.println ("Enter a song title: ");
			title = input.nextLine();

			// Input user artist name
			System.out.println ("\nEnter the artist name: ");
			artist = input.nextLine();

			// Input user verse lines
			System.out.println ("\nEnter line 1 of the song verse: ");
			line1 = input.nextLine();
			System.out.println ("\nEnter line 2 of the song verse: ");
			line2 = input.nextLine();
			System.out.println ("\nEnter line 3 of the song verse: ");
			line3 = input.nextLine();
			System.out.println ("\nEnter line 4 of the song verse: ");
			line4 = input.nextLine();
			System.out.println ("\n\nYOUR SONG VERSE: \n");


			// Display user song information
			System.out.println ("\nTitle: " + title + "\nArtist: " + artist);

			System.out.println ("\n" + line1 + "\n\t" + line2 + "\n\t\t" + line3 + "\n\t\t\t" + line4);

			System.out.println ("\n" + line1 + "\n\t" + line2 + "\n\t" + line3 + "\n\t" + line4 + "\n");

			System.out.println ("\n\"" + line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\"\n");
		}
}