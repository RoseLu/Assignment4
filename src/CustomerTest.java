

//this test includes book&customer
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		Customer a=new Customer("Amanda");
		Book b=new Book("WOW",2.3f);
		Book c=new Book("Java", 2.0f);
		a.buyBook(b);
		a.buyBook(c);
		
		Assert.assertEquals(4.3f, a.totalPrice(), .01);
		Assert.assertTrue(a.getNumberOfBook()==2);
	}

}
