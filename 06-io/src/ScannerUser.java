import java.util.Scanner;

public class ScannerUser {
	public static void main (String[] args)
	{
		String s = "foo 12 18 hello";
		Scanner sScanner = new Scanner(s);
		String foo = sScanner.next();
		System.out.println(foo);
		
		int bar = sScanner.nextInt();
		System.out.println(bar);
		
		String[] parts = s.split(" ");
		System.out.println(parts[3]);
		
	}

}
