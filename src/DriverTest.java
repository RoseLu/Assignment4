
//this test include driver & GasTank & Car
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DriverTest {

	@Test
	public void test() {
		Car c=new Car("BMW");
		Driver d= new Driver(c);
		
		double gasLevel = c.getGasLevel();
		d.drive(3);
		
		Assert.assertTrue(c.getGasLevel() < gasLevel);
	}

}
