package mypackage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Container<Person, Integer> p = new Container<Person, Integer>();
		p.add(new Person(20));
		p.add(new Person(25));
		p.add(new Person(21));

		System.out.println(p.aggregateAllElements());
		System.out.println(p.cloneElementAtIndex(1));
		
		Container<Car, String> c = new Container<Car, String>();
		c.add(new Car("Toyota"));
		c.add(new Car("Honda"));
		c.add(new Car("KIA"));
		
		System.out.println(c.aggregateAllElements());
		System.out.println(c.cloneElementAtIndex(1));
		
		Container<Manufacturer, ArrayList<String>> m = new Container<Manufacturer, ArrayList<String>>();
		m.add(new Manufacturer("Toyota", new ArrayList<String>() {{
		    add("Rav4");
		    add("Yaris");
		    add("Corolla");
		}}));
		m.add(new Manufacturer("Honda", new ArrayList<String>() {{
		    add("Civic");
		    add("Accord");
		    add("CR-V");
		}}));
		m.add(new Manufacturer("KIA", new ArrayList<String>() {{
		    add("Rio");
		    add("Cee'd");
		    add("Sportage");
		}}));
		
		System.out.println(m.aggregateAllElements());
		System.out.println(m.cloneElementAtIndex(1));
		
		
	}

}

