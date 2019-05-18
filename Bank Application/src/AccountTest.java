import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	
	
	
	@Test
	public void testInit()
	{
		Account account = new Account(0);
		
		int expectedResult = 0;
		int actualResult = account.balance();
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testOverDraft()
	{
		Account account = new Account(50);
		account.withdraw(100);
		int expectedResult = 50 ;
		int actualResult = account.balance();
		
		assertEquals(expectedResult,actualResult);
			
	}
	
	@Test
	public void testWithdrawPositive()
	{
		Account account = new Account(50);
		account.withdraw(10);
		int expectedResult = 40 ;
		int actualResult = account.balance();
		
		assertEquals(expectedResult,actualResult);
			
	}
	
	@Test
	public void testWithdrawNegative()
	{
		Account account = new Account(50);
		account.withdraw(-100);
		int expectedResult = 50 ;
		int actualResult = account.balance();
		
		assertEquals(expectedResult,actualResult);
			
	}
	
	@Test
	public void testDepositPositive()
	{
		Account account = new Account(50);
		account.deposit(100);
		int expectedResult = 150 ;
		int actualResult = account.balance();
		
		assertEquals(expectedResult,actualResult);
			
	}
	
	@Test
	public void testDepositNegative()
	{
		Account account = new Account(50);
		account.deposit(-100);
		int expectedResult = 50 ;
		int actualResult = account.balance();
		
		assertEquals(expectedResult,actualResult);
			
	}


}
