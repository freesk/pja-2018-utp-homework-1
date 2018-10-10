package mypackage;

import java.util.ArrayList;

public class Manufacturer implements IAggregable<Manufacturer, ArrayList<String>>, IDeeplyCloneable<Manufacturer> {
	
	private String name = "";
	private ArrayList<String> series = null;
	
	public Manufacturer() {
	}
	
	public Manufacturer(String name, ArrayList<String> series) {
		this.name = name;
		this.series = series;
	}
	
	public ArrayList<String> aggregate(ArrayList<String> intermediateResult) {
		if  (intermediateResult == null)
			return series;
		ArrayList<String> foo = new ArrayList<String>();
		for (String s : intermediateResult) 
			foo.add(s);
		for (String s : series)
			foo.add(s);
		return foo;
	}
	
	public Manufacturer deepClone() {
		Manufacturer clone = new Manufacturer();
		clone.name = name;
		clone.series = series;
		return clone;
	}
}