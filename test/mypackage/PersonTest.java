package mypackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private static final int AGE = 20;

	private Person person;

	@Before
	public void before() {
		person = new Person(AGE);
		Assert.assertEquals(AGE, person.age());
	}

	@Test
	public void aggregate() {
		int aggregate = person.aggregate(null);
		Assert.assertEquals(AGE, aggregate);
		final int init = 20;
		Assert.assertEquals((int) (AGE + init), (int) (person.aggregate(init)));
	}

	@Test
	public void deepClone() {
		Person clone = person.deepClone();
		Assert.assertEquals(person.age(), clone.age());
		Assert.assertNotSame(person, clone);
	}
}