
public class Student <GradeType>
{
	private GradeType grade;
	private String name;
	
	Student (String name, GradeType grade)
	{
		this.name = name;
		this.grade = grade;
	}
	
	public String toString ()
	{
		return this.name+" has a "+this.grade;
	}
	
	// really cool methods
}