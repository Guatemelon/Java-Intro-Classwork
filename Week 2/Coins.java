//*************************************************************************
//Coins.java
//Author			Stellar Student
//
// Sample uses of data types, casting, and remainder operator
//
// NOTE:  Formating of output, such as rounding to two decimal places
//        will not be discussed in class until a bit later.
//*************************************************************************

import java.util.Scanner;

public class Coins
{
	public static void main (String[] args)
	{
		//---------------------------------------------------------
		//Declare all of the variables
		//---------------------------------------------------------
		int HarryQuarters = 0, LarryDimes = 0, JerryNickels = 0;
		final float QUARTER = 0.25f, DIME = 0.10f, NICKEL = 0.05f;
		float Harry = 0.0f, Larry = 0.0f, Jerry = 0.0f, help = 0.0f, Sherri = 0.0f;



		Scanner scan = new Scanner (System.in);

		//---------------------------------------------------------
		// Input the total amount of each guy's purchase
		//---------------------------------------------------------

		System.out.print ("Enter the total amount of Harry's purchase:  ");
	    Harry = scan.nextFloat();
		System.out.print ("Enter the total amount of Larry's purchase:  ");
	    Larry = scan.nextFloat();
   		System.out.print ("Enter the total amount of Jerry's purchase:  ");
	    Jerry = scan.nextFloat();

		//-------------------------------------------------------------------------------
		// Calculate the number of quarters Harry needs and the amount Sherri will help
		// Output these values
		//-------------------------------------------------------------------------------


		HarryQuarters = (int) (Harry/QUARTER);
		help = Harry%QUARTER;
		Sherri += help;


		System.out.println("\nNumber of Quarters Harry uses: \t" + HarryQuarters);
		System.out.println("Amount Sherri helps Harry:\t" + help);


		//-------------------------------------------------------------------------------
		// Calculate the number of dimes Larry needs and the amount Sherri will help
		// Output these values
		//-------------------------------------------------------------------------------


		LarryDimes = (int) (Larry/DIME);
		help = Larry%DIME;
		Sherri += help;


		System.out.println("\nNumber of Dimes Larry uses: \t" + LarryDimes);
		System.out.println("Amount Sherri helps Larry:\t" + help);


		//-------------------------------------------------------------------------------
		// Calculate the number of nickels Jerry needs and the amount Sherri will help
		// Output these values
		//-------------------------------------------------------------------------------


		JerryNickels = (int) (Jerry/NICKEL);
		help = Jerry%NICKEL;
		Sherri += help;


		System.out.println("\nNumber of Nickels Jerry uses: \t" + JerryNickels);
		System.out.println("Amount Sherri helps Jerry:\t" + help);

		//---------------------------------------------------------
		// Display the total Sherri helped the 3 guys together
		//---------------------------------------------------------

		System.out.println ("NOTE:  Formating of output, such as rounding to two decimal places");
		System.out.println ("       will not be discussed in class until a bit later in the semester\n\n");






	}
}
