//--------------------------------------------------------------
// A driver program for Horse class
// Save this program in the same location as your Horse class
// Compile your Horse class.  Compile this driver program.
// Run the driver program to test your class
//--------------------------------------------------------------


import java.util.Scanner;
import java.util.Calendar;

public class HorseDriver
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);

		//-----------------------------------------------------------------------------------------------
		// New objects are instantiated using the Horse class
		// 2 objects use a constructor with 6 parameters
		// 1 object uses a default constructor (no parameters)
		//-----------------------------------------------------------------------------------------------

		Horse WindstarHorse = new Horse("Shiraz", 1340, 2014, 'M', "Run for Gold", "Miss Derby");
		Horse CalumetHorse = new Horse("Lady Luck", 1280, 2015, 'F', "Fly Like the Wind", "Duchess of Lex");
		Horse StonyBrookHorse = new Horse();

		//-----------------------------------------------------------------------------------------------
		// Variables are declared
		//-----------------------------------------------------------------------------------------------

		String name = "", sire = "", dam = "", sGender = "";
		int myAge = 0;
		//String fullGender;

		int weight = 0, birthYear = 0;
		char gender = ' ';
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		//-----------------------------------------------------------------------------------------------
		// Data is input for myHorse
		//-----------------------------------------------------------------------------------------------

		System.out.println("---- Lexington KY Breeding Farm ----\n\n");
		while (name.equals(""))
		{
			System.out.print ("What is your horse's name? ");
			name = in.nextLine();
		}

		while (weight <= 0 || weight >= 2500)
		{
			System.out.print ("What is your horse's weight (between 1 and 2500 pounds)? ");
			weight = in.nextInt();
		}

		while (birthYear < 1950 || birthYear > currentYear)
		{
			System.out.print ("What year was your horse born (4-digit year between 1950 and present) ");
			birthYear = in.nextInt();
			sGender = in.nextLine();
		}

		while ( !(gender == 'M' || gender =='F') )
		{
			System.out.print ("What gender is your horse (use M or F)? ");
			sGender =in.nextLine();
			gender = (char) sGender.toUpperCase().charAt(0);
		}

		while (sire.equals(""))
		{
			System.out.print ("Who is the sire of your horse (father's name)? ");
			sire = in.nextLine();
		}

		while (dam.equals(""))
		{
			System.out.print ("Who is the dam of your horse (mother's name)? ");
			dam = in.nextLine();
		}

		System.out.println("\n---- Lexington KY Breeding Farm ----\n\n");

		//-----------------------------------------------------------------------------------------------
		// The data values for myHorse are updated using the setters (mutators) in the Horse class
		//-----------------------------------------------------------------------------------------------

		StonyBrookHorse.setName(name);
		StonyBrookHorse.setWeight(weight);
		StonyBrookHorse.setBirthYear(birthYear);
		StonyBrookHorse.setGender(gender);
		StonyBrookHorse.setSire(sire);
		StonyBrookHorse.setDam(dam);


		//-----------------------------------------------------------------------------------------------
		// Examples of using getters (accessors) to "access" instance data from an object in the Horse class
 		//-----------------------------------------------------------------------------------------------

		System.out.println ("Windstar\'s horse is: " + WindstarHorse.getName() + "\n\tWeight: " + WindstarHorse.getWeight() + " pounds.\n");
		System.out.println ("Calumet\'s horse is: " + CalumetHorse.getName() + "\n\tSire: " + CalumetHorse.getSire()
							+ "\n\tDam: " + CalumetHorse.getDam() + "\n");
		System.out.println ("Stony Brook\'s horse is: " + StonyBrookHorse.getName() + "\n\tBirth year: "
							+ StonyBrookHorse.getBirthYear() + "\n");



		//-----------------------------------------------------------------------------------------------
		// Examples of using the toString( ) method to display instance data from a class
		// Also, uses the getAge( ) method
		//-----------------------------------------------------------------------------------------------


		System.out.println ("Testing toString method: \n\n" + StonyBrookHorse +
							"Testing getAge() method: \n\n" + "\nAge:\t" +  StonyBrookHorse.getAge() +"\n\n");


	}
}