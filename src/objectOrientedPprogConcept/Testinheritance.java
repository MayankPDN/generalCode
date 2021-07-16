package objectOrientedPprogConcept;




public class Testinheritance {

	public static void main(String[] args)    {
		
		/* created object to use MBW method, 
		start is in both parent car and child bMW both , it takes from child 
		( method name and argument has to be same */
		
		BMW x= new BMW();
		x.start();
		x.stop();
		x.safety();
		x.refuel();
	

		car c1 =new BMW();
		c1.start(); // we can use start but can not use safety as it is exclusive to child class.
		
		
		
	
		
	}

}
