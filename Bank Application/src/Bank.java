
import java.util.ArrayList;

public class Bank {
	
	
	public Bank() {
		this.customers = new ArrayList<Customer>();
	}
	
	/** 
	 * Gets the list of customer objects from the Bank
	 * @return
	 */
	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}
	
	/**
	 * Adds a new customer to the database.
	 * @param name
	 * @param initialDeposit
	 */
	public void addCustomer(String name, int initialDeposit) {
		Customer c = new Customer(name, initialDeposit);
		customers.add(c);
	}
	
	/** 
	 * Removes the specified customer from the bank's database
	 * Returns true if the customer was successfully removed, false otherwise.
	 * @param name
	 * @return true if customer was removed.
	 */
	public boolean removeCustomer(String name) {
		for (Customer customer : this.customers) 
		{ 
		    if (customer.getName() == name) {
		    	this.customers.remove(customer);
		    	return true;
		    }
		}
		return false;
	}
	
	/**
	 * Returns the number of customers in the bank's database.
	 * @return
	 */
	public int getNumberOfCustomers() {
		return this.customers.size();
	}
	
	/** 
	 * Transfers money from one account to another
	 * Bank looks up accounts by name. 
	 * @param fromCustomer
	 * @param toCustomer
	 * @param amountToTransfer
	 * @return
	 */
	public boolean transferMoney(Customer fromCustomer, Customer toCustomer, int amountToTransfer) {
		//withdraw from customer 1's account
		fromCustomer.getAccount().withdraw(amountToTransfer);
		
		//deposit into customer 2's account
		toCustomer.getAccount().deposit(amountToTransfer);
		return true;
	}
	
	private ArrayList<Customer> customers;
	
}
