package mypackage;

public class Car implements IAggregable<Car, String>, IDeeplyCloneable<Car> {
	
	public final String manufacturer;
	
	public Car(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String aggregate(String intermediateResult) {
		if  (intermediateResult == null)
			return manufacturer;
		return manufacturer + ", " + intermediateResult;
	}
	
	public Car deepClone() {
		Car clone = new Car(manufacturer);
		return clone;
	}
}