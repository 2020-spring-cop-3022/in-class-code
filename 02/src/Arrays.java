
public class Arrays {
	public static void main (String[] args)
	{
		System.out.println("foo");
		int[] foo;
		foo = new int[10];
		
		int[] bar = new int[10];
		System.out.println(bar.length);
		bar[0] = 10;
		bar[1] = 12;
		
		int total = 0;
		
		for (int thisBar: bar)
		{
			thisBar *= 2;
			total += thisBar;
		}
		
		System.out.println("Average bar is "+total/bar.length);
		
		total = 0;
		for (int i = 0; i < bar.length; ++i)
		{
			total += bar[i];
			bar[i] *= 2;
		}
		// System.out.println(i);
		System.out.println("Average bar is "+total/bar.length);
		
		int[] baz = {1, 2, 3};
		System.out.println("Last element is "+getLast(baz));
		int[] baz1 = {1, 2, 3};
		
		if (baz == baz1)
		{
			System.out.println("same");
		}
		if (baz.equals(baz1))
		{
			System.out.println("same using equals");
		}
		System.out.println(baz);
		
		char[] aWord = {'a', 'b', 'c'};
		System.out.println(aWord);
		
		System.out.println(baz.length);
		
		String[] words = new String[10];
		String name = "Bo Jackson";
		name.length();
		
		System.out.println(words[0]);
		//System.out.println(words[0].length());
		
		int[][] scores = new int[30][100];
		getClassAverage(scores);
	}
	
	public static int getLast (int[] foo)
	{
		return foo[foo.length - 1];
	}
	
	public static double getClassAverage (int[][] scores)
	{
		// 30 X 100
		System.out.println("2D length "+scores.length);
		// array of 30 arrays
		
		System.out.println("Inner length "+scores[0].length);
		return 0.0;
	}
}
