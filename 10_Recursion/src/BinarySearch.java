
public class BinarySearch {
	public static int search (Comparable[] list, int start, int end, Comparable searchKey)
	{
		int middle = (start + end) / 2;
		
		if (end < start)
		{
			return -1;
		}
		
		int comparison = list[middle].compareTo(searchKey);
		
		if (comparison == 0)
		{
			return middle;
		}
		else if (comparison < 0)
		{
			// search right half
			return BinarySearch.search(list, middle + 1, end, searchKey);
		}
		else // left half
		{
			return BinarySearch.search(list, start, middle - 1, searchKey);
		}
	}
}
