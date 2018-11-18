//--------------------------------------------------------------------------------
//  Customer class for an mechanic shop to repair automobiles
//  This class illustrates the use of encapsulation, constructors, accessors,
//  mutators, static data items, and an overridden toString() method
//--------------------------------------------------------------------------------

import java.text.DecimalFormat;

public class Customer
{
	private String name;
	private float parts;
	private float labor;
	private static DecimalFormat fmt = new DecimalFormat ("$#,##0.00");

	//--------------------------------------------------------------------------------
	//  Constructor - requires 3 parameters: name, cost of parts, and cost of labor
	//  Input validation performed on arguments
	//--------------------------------------------------------------------------------

	public Customer(String cname, float cparts, float clabor)
	{
		name = cname;

		if (cparts > 0) parts = cparts;
		else parts = 0.0f;

		if (clabor > 0) labor = clabor;
		else labor = 0.0f;
	}

	//--------------------------------------------------------------------------------
	//  Constructor - Default
	//  Data members intialized to default values
	//--------------------------------------------------------------------------------

	public Customer()
	{
		name = "";
		parts = 0.0F;
		labor = 0.0F;
	}

	//--------------------------------------------------------------------------------
	//  Accessors
	//--------------------------------------------------------------------------------
	public String getName()
	{	return name;	}

	public float getParts()
	{	return parts;	}

	public float getLabor()
	{	return labor;	}


	//--------------------------------------------------------------------------------
	//  Mutators - With input validation
	//--------------------------------------------------------------------------------

	public void setName(String cname)
	{	if(! cname.equals(""))
			name = cname;
	}


	public void setParts(float cparts)
	{	if (cparts > 0)
			parts = cparts;
	}

	public void setLabor(float clabor)
	{	if (clabor > 0)
			labor = clabor;
	}

	//--------------------------------------------------------------------------------
	//  Other methods
	//--------------------------------------------------------------------------------
	public float calcTotal()
	{
		return (parts + labor);
	}

	//public String toString()
	//{
	//	return "Work for " + name + ": Parts: " + fmt.format(parts) + " Labor: " + fmt.format(labor);
	//}
}