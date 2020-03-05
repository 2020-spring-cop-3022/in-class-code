
public class BankAccount {
	private String accountType;
	private Amount balance;
	
	public BankAccount (String accountType, String balance)
	{
		this.accountType = accountType;
		this.balance = new Amount(balance);
	}
	
	private class Amount
	{
		private int dollars;
		private int cents;
		
		public Amount (String input)
		{
			String[] parts = input.split("\\."); // \.
			this.dollars = Integer.valueOf(parts[0]);
			this.cents = Integer.valueOf(parts[1]);
			
			System.out.println("$"+this.dollars+"."+this.cents);
		}
	}
}
