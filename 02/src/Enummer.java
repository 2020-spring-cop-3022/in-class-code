
public class Enummer {
	public static void main (String[] args)
	{
		Weekdays day = Weekdays.TUESDAY;
		int dayi = 0; // 0 is Monday
		
		//...
		
		switch (day)
		{
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println(Weekdays.TUESDAY);
			break;
		default:
			System.out.println("other");
		}
	}
}
