package selenium;

public class Exceptionunderstanding {
	int a= 10;
	public static void main(String[] args) {
		
		
		 //in java we cannot divide any value with 0 but it will not give any error before execute
		//int i=5/0;
		//System.out.println(i);
		
		// exception is caught and gives option to handle it.
		
		//Thread.sleep(2000);
		
		
		//Exceptionunderstanding obj = new Exceptionunderstanding();
		//obj = null;
		//System.out.println(obj.a);
		
		try{
			int i = 5/0; // exception
			
		}
		
		catch(ArithmeticException e) { //we have to write this ArithmeticException e
			e.printStackTrace(); // we have to remember e.printStackTrace
			System.out.println(e.getMessage()); // this will give message  for exception
		}
		
		System.out.println("abc"); // we can print this even thought there exception with i= 5/0
	}

}
