import java.io.Serializable;

class Submarine implements Serializable
{
	private String name;
	private int length;
	private int crewSize;

	// final private static long serialVersionUID = 123456789;
	/*
		Leaving off the above makes Java do this for you based on class characteristics and also system/compiler characteristics
		which might be problematic if the file is created and one system but meant to be used on another
	*/

	Submarine (String name, int length, int crewSize)
	{
		this.name = name;
		this.length = length;
		this.crewSize = crewSize;
	}

	public void setLength (int newLength)
	{
		this.length = newLength;
	}

	public String toString ()
	{
		return "\nThe only good Marines are Submarines!\n"+
			"The USS "+this.name+
			" is "+this.length+" feet long"+
			" and carries a "+this.crewSize+" person crew.";
	}
}
