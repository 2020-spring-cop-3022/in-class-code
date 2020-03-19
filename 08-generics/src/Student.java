
public class Student <GradeType extends Comparable<GradeType>, T>
{
	private GradeType grade;
	private String name;
	private T id;
	
	Student (String name, GradeType grade, T id)
	{
		this.name = name;
		this.grade = grade;
		this.id = id;
	}
	
	public String toString ()
	{
		return this.name+" has a "+this.grade;
	}
	
	// really cool methods
}