import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

import com.org.ApplicationUtil;
import com.org.CreditCard;

public class MainTest {
	CreditCard c = new CreditCard(Long.valueOf(5653), "fuzzy", "abc@gmail.com", Long.valueOf("9398429325"), 10000.0,
			ApplicationUtil.convertStringToDate("2021-05-01"), ApplicationUtil.convertStringToDate("2021-05-02"));

	

	@Test
	public void testGetCreditCardNum() {
		long expected=5653;
		long actual=c.creditCardNum;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testGetCustomerName() {
		String expected="fuzzy";
		String actual=c.customerName;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testGetCustomerEmail() {
		String expected="abc@gmail.com";
		String actual=c.customerEmail;
		assertEquals(expected,actual);
	
	}
	@Test
	public void testGetCustomerPhone() {
		long expected=Long.valueOf("9398429325");
		long actual=c.customerPhone;
		assertEquals(expected,actual);
	}
	@Test
	public void testGetBillAmount() {
		long expected=10000;
		long actual=(long)c.billAmount;
		assertEquals(expected,actual);
		
}
	

	@Test
	public void testgetDueDate() {
		Date expected=ApplicationUtil.convertStringToDate("2021-05-01");
		Date actual=c.dueDate;
		assertEquals(expected,actual);	
	
	}
	@Test
	public void testgetPaymentDate() {
		Date expected=ApplicationUtil.convertStringToDate("2021-05-02");
		Date actual=c.paymentDate;
		assertEquals(expected,actual);
	}

}
