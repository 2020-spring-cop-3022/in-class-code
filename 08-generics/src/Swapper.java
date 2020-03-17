
public class Swapper {
	public static <MyClass> void swap (MyClass[] items, int i, int  j)
	{
		MyClass temp = items[i];
		items[i] = items[j];
		items[j] = temp;
	}
}
