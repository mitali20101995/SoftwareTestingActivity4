

public class Customer {
	/**
	 * Creates a new customer with an initial starting balance
	 * Customers who don't provide an initial deposit get a starting balance of 0
	 * @param name The customer name
	 * @param initialDeposit  The initial amount to deposit into the account.
	 *
	 */
		
	public Customer(String name, int initialDeposit) {
		this.name = name;
		if (initialDeposit > 0) {
			this.account = new Account(initialDeposit);
		}
	}
	
	/**
	 * Get the account
	 * @return The customer's account
	 */
	public Account getAccount() {
		return this.account;
	}
	
	public String getName() {
		return name;
	}
	
	
	// instance variables
	
	private String name;
	private Account account = null;
}
