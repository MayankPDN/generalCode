package selenium;

public class Methodofoverloading {

	public static void main(String[] args) {
		
		Methodofoverloading obj = new Methodofoverloading(); 
		
		obj.sum();
		obj.sum(22);
		obj.sum(25, 25);

	}
public void sum() { 
	System.out.println("no value sum");
	
}
public void sum(int a) {
	System.out.println("one value sum");
	System.out.println(a);
	
}
public void sum(int k, int l) {
	System.out.println("two value sum");
	System.out.println(k/l);
}
}
