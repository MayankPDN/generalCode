package objectOrientedPprogConcept;

public class Constructorwiththisandsuperkeyword {

	String name;
	int age;

	public Constructorwiththisandsuperkeyword(String name, int age) {
		this.name = name; // To define which name to be used.
		this.age = age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		Constructorwiththisandsuperkeyword obj = new Constructorwiththisandsuperkeyword("Tim", 20);

	}

}
