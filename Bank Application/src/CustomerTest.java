import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	public void testAccountNotNull()
	{
		Customer customer = new Customer("Mitali",0);
		
		assertNotNull(customer.getAccount());
		
	}
	
	@Test
	public void testAccountNotNullPositive()
	{
		Customer customer = new Customer("Mitali",10);
		
		assertNotNull(customer.getAccount());
		
		
	}
	@Test
	public void testInitialAmountPositive()
	{
		Customer customer = new Customer("Mitali",10);
		int expectedResult = 10;
		int actualResult = customer.getAccount().balance();
		assertEquals(expectedResult,actualResult);
		
	}
	
	
}
