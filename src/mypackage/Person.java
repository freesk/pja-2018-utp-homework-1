package mypackage;

public class Person implements IAggregable<Person, Integer>, IDeeplyCloneable<Person> {
	
	private int age;
	
	public Person() {
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public int age() {
		return age;
	}

	public Integer aggregate(Integer intermediateResult) {
		if  (intermediateResult == null)
			return age;
		return age + intermediateResult;
	}
	
	public Person deepClone() {
		Person clone = new Person();
		clone.age = age;
		return clone;
	}
}