import java.util.ArrayList;

public class Main {
	public static void main (String[] args)
	{
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(2);
		myInts.add(5);
		
		System.out.println(myInts.size());
		
		System.out.println(myInts.get(0));
		
		myInts.remove(new Integer(2));
		System.out.println(myInts.size());
	}
}
