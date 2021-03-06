//-------------------------------------------------
//   State Class
//-------------------------------------------------

public class State
{
	private String stateName;
	private String stateCapital;
	private	String stateBird;
	private String stateFlower;


//--------------------------------------------------
//    Constructor for the State class
//--------------------------------------------------

	public State (String stateName, String stateCapital, String stateBird, String stateFlower)
	{
		this.stateName = stateName;
		this.stateCapital = stateCapital;
		this.stateBird = stateBird;
		this.stateFlower = stateFlower;
		}

//--------------------------------------------------
//    Accessors for the State class
//--------------------------------------------------

	public String getStateName()
	{	return stateName;	}

	public String getStateCapital()
	{	return stateCapital;	}

	public String getStateBird()
	{	return stateBird;	}

	public String getStateFlower()
	{	return stateFlower;	}


//--------------------------------------------------
//    Mutators for the State class
//--------------------------------------------------

	public void setStateName(String stateName)
	{	this.stateName = stateName;	}

	public void setStateCapital(String stateCapital)
	{	this.stateCapital = stateCapital;	}

	public void setStateBird(String stateBird)
	{	this.stateBird = stateBird;	}

	public void setStateFlower(String stateFlower)
	{	this.stateFlower = stateFlower;	}

	public String toString ()
	{ return stateName + " " + stateCapital + " " + stateBird + " " + stateFlower ; }

}