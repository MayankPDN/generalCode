package selenium;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x= "100";
		System.out.println(x+20); // Converting String to int , double and boolean
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y= "12.50";
		System.out.println(y);
		
		double j= Double.parseDouble(y);
		System.out.println(j+20);
		
		String z = "true";
		System.out.println(z);
		
		boolean k= Boolean.parseBoolean(z);
		System.out.println(k);
		
		int p= 100; // int to String Conversion :
		System.out.println(p+20);
		
		String d = String.valueOf(p);
		System.out.println(d+20);

	}

}
