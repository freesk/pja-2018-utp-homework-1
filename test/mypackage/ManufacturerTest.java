package mypackage;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ManufacturerTest {
	
	private Manufacturer manufacturer;

	@Test
	public void aggregateNull() {
		manufacturer = new Manufacturer("Honda", null);
		ArrayList<String> aggregate = manufacturer.aggregate(null);
		Assert.assertEquals(null, aggregate);
	}
	
	@Test
	public void aggregateThreeRecords() {
		manufacturer = new Manufacturer("Honda", new ArrayList<String>() {{
		    add("Rav4");
		    add("Yaris");
		    add("Corolla");
		}});
		ArrayList<String> aggregate = manufacturer.aggregate(new ArrayList<String>() {{
		    add("TEST");
		}});
		Assert.assertEquals("[TEST, Rav4, Yaris, Corolla]", aggregate.toString());
	}
	

}
