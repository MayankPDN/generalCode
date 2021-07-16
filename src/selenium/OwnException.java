package selenium;

public class OwnException {

	public static void main(String[] args)  {
		
		System.out.println("London");
		System.out.println("France");

		
		try {
		throw new Exception("don't travell its covid-19");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("vaccine is here");
		
		String Exec_Flag = " ";
		if(Exec_Flag.equals(" ")) {
			
			try {
			throw new Exception("stay home");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("vaccine is here 1");
			
			try {
			throw new Exception (" i dont want to die");
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
