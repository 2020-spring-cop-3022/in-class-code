import java.util.ArrayList;

public class Max {
	public static <MyType extends Comparable<MyType>> MyType getMax (ArrayList<MyType> items)
	{
		// do some stuff
		MyType maxElement = items.get(0);
		for (MyType item: items)
		{
			if (item.compareTo(maxElement) > 0)
			{
				maxElement = item;
			}
		}

		return maxElement;
	}

}
