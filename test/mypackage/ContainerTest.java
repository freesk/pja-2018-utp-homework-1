package mypackage;

import org.junit.Assert;
import org.junit.Test;

public class ContainerTest {
	
	@Test
	public void aggregateAllElements() {
		Container<Car, String> c = new Container<Car, String>();
		c.add(new Car("Toyota"));
		c.add(new Car("Honda"));
		c.add(new Car("KIA"));
		Assert.assertEquals("KIA, Honda, Toyota", c.aggregateAllElements());
	}
	
	@Test
	public void cloneElementAtIndexManufacturerName() {
		Container<Car, String> c = new Container<Car, String>();
		c.add(new Car("Toyota"));
		c.add(new Car("Honda"));
		c.add(new Car("KIA"));
		Car foo = c.cloneElementAtIndex(1);
		Assert.assertEquals("Honda", foo.manufacturer);
	}
	
	@Test
	public void cloneElementAtIndexNotEqual() {
		Container<Car, String> c = new Container<Car, String>();
		c.add(new Car("Toyota"));
		Car honda = new Car("Honda");
		c.add(honda);
		c.add(new Car("KIA"));
		Car foo = c.cloneElementAtIndex(1);
		Assert.assertEquals(false, honda.equals(foo));
	}
	

}
