
public class Sort
{
	public static void sortMe (Comparable[] unsortedList)
	{
		for (int i = 0; i < unsortedList.length; ++i)
		{
			for (int j = i + 1; j < unsortedList.length; ++j)
			{
				if (unsortedList[i].compareTo(unsortedList[j]) > 0)
				{
					Sort.swap(unsortedList, i, j);
				}
			}
		}
	}
	
	private static void swap (Comparable[] unsortedList, int i, int j)
	{
		Comparable temp = unsortedList[i];
		unsortedList[i] = unsortedList[j];
		unsortedList[j] = temp;
	}
}
