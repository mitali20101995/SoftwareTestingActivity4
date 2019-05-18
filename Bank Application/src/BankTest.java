import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	public void testNewBankHasZeroCustomers()
	{
		Bank bank = new Bank();
		int expectedResult = 0;
		int actualResult = bank.getNumberOfCustomers();
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testCustomerCountIncreases()
	{
		Bank bank = new Bank();
		bank.addCustomer("Mitali", 100);
		int expectedResult = 1;
		int actualResult = bank.getNumberOfCustomers();
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testCustomerCountDecreases()
	{
		Bank bank = new Bank();
		bank.addCustomer("Mitali", 100);
		bank.removeCustomer("Mitali");
		int expectedResult = 0;
		int actualResult = bank.getNumberOfCustomers();
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testCustomerIdentityByName()
	{
		Bank bank = new Bank();
		bank.addCustomer("Mitali", 100);
		String expectedResult = "Mitali";
		String actualResult = bank.getCustomers().get(0).getName();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testAfterTrasferAccountBalances()
	{
		Bank bank = new Bank();
		bank.addCustomer("Mitali", 100);
		bank.addCustomer("Jenelle", 100);
		
		Customer customerMitali = bank.getCustomers().get(0);
		Customer customerJenelle = bank.getCustomers().get(1);
		
		bank.transferMoney(customerMitali, customerJenelle, 50);
		
		int expectedxBalanceJenelle = 150;
		int expectedxBalanceMitali = 50;
		
		assertEquals(expectedxBalanceMitali, customerMitali.getAccount().balance());
		assertEquals(expectedxBalanceJenelle, customerJenelle.getAccount().balance());
	}
}
