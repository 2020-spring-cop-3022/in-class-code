import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileScanner {
	public static void main (String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("src/in.csv");
			Scanner fileS = new Scanner(fin);
			fileS.useDelimiter(",");
			String foo = fileS.next();
			int bar = fileS.nextInt();
			String baz = fileS.next();
			// System.out.println(foo);
			// System.out.println(bar);
			// System.out.println(baz);
			
			System.out.printf("%15s | %15d | %15s\n", foo, bar, baz);
			
			FileOutputStream fout = new FileOutputStream("src/out.txt", true);
			PrintWriter printOut = new PrintWriter(fout);
			printOut.printf("%15s | %15d | %15s\n", foo, bar, baz);
			printOut.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
