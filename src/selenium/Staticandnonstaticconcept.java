package selenium;

public class Staticandnonstaticconcept {

	String name= "tim"; // non static global variable.
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		
		//calling static method.
		sum();// calling directly
		Staticandnonstaticconcept.sum(); // calling by class name ex:
		
		System.out.println(age); // or with class name
		System.out.println(Staticandnonstaticconcept.age);
		
		// calling non static method and variable: with creating object
		
		Staticandnonstaticconcept obj = new Staticandnonstaticconcept();
		//obj.sendmail();
		System.out.println(obj.name);
		
		
		
		 	}
	public static void sum() { 
		System.out.println("sum method");
		
}
	public void sendmail() {
		System.out.println("send mail method");
	}

}

