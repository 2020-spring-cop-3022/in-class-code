
public class Main {
	private Student[] students;

	public void createStudents (String[] studentNames)
	{
		this.students = new Student[studentNames.length];
		for (int i = 0; i < studentNames.length; ++i)
		{
			this.students[i] = new Student(studentNames[i]);
		}
		
		for (String studentName: studentNames)
		{
			System.out.println("Hello "+studentName);
		}
	}
	
	public static void main (String[] ags)
	{
		int foo = 41;
		System.out.println("" + foo + foo);
		
		double a = 15 / (double)25;
		System.out.println(a);
	}
}
