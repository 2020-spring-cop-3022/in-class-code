import java.io.FileInputStream;
import java.util.Scanner;

public class FileScanner {
	public static void main (String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("in.csv");
			Scanner fileS = new Scanner(fin);
			String foo = fileS.next();
			System.out.println(foo);
		}
		catch (Exception e)
		{
		}
	}
}
