//--------------------------------------------------------------
// Driver program for Customer class
// Illustrates the use of user-defined classes.
//--------------------------------------------------------------

import java.util.Scanner;
import java.text.DecimalFormat;

public class CarDriver
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		DecimalFormat fmt = new DecimalFormat ("$#,##0.00");

		//----------------------------------------------------------------------------------------------
		// New objects are instantiated using the Customer class (Henry and Julie)
		// Henry is instantiated with data values using a constructor with a parameter list
		// Julie is instantiated with a constructor with no parameters so that mutators can be demonstrated later.
		//----------------------------------------------------------------------------------------------

		Customer Henry = new Customer("Henry", 150.89F, 315.15F);   //  Henry's data using the constructor with 3 parameters

		Customer Julie = new Customer();							//  Julie is created using a default constructor with no parameters
																	//  Default values are given to the data items for Julie

		//----------------------------------------------------------------------------------------------
		// Variables are declared
		//----------------------------------------------------------------------------------------------

		String customerName;
		float customerParts, customerLabor;

		//----------------------------------------------------------------------------------------------
		// Data is input for the Julie object
		//----------------------------------------------------------------------------------------------
		System.out.print ("Customer name: ");
		customerName = in.nextLine();


		System.out.print ("Cost of parts: ");
		customerParts = in.nextFloat();

		System.out.print ("Cost of labor: ");
		customerLabor = in.nextFloat();
		System.out.println();


		//----------------------------------------------------------------------------------------------
		// Mutators from the Customer class are used to update the data for the Julie object
    	//----------------------------------------------------------------------------------------------
		Julie.setName(customerName);
		Julie.setParts(customerParts);
		Julie.setLabor(customerLabor);


		//----------------------------------------------------------------------------------------------
		// At this point the objects named Henry and Julie have data values.
		//
		// The calcTotal() method in the Customer class will be used to total the bill for Henry and Julie
		// The totals are displayed
		//----------------------------------------------------------------------------------------------

		System.out.println("====Examples of using calctotal method=====");
		System.out.println("Henry Total: " + fmt.format(Henry.calcTotal()));
		System.out.println("Julie Total: " + fmt.format(Julie.calcTotal()));
		System.out.println();

		//----------------------------------------------------------------------------------------------
		// The following statements illustrate the use of accessors from the Customer class
		//----------------------------------------------------------------------------------------------

		System.out.println("====Examples of using accessors=====");
		System.out.println ("Name of first customer: " + Henry.getName());
		System.out.println ("Labor charge for second customer: " + fmt.format(Julie.getLabor()));
		System.out.println();


		//----------------------------------------------------------------------------------------------
		// Example of using a class method:  Printing a record
		//----------------------------------------------------------------------------------------------
		System.out.println("====Examples of toString method=====");
		System.out.println(Henry);
		System.out.println(Julie);
		System.out.println();

	}
}