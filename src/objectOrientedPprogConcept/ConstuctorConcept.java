package objectOrientedPprogConcept;

public class ConstuctorConcept {

	public ConstuctorConcept() {
		System.out.println("defailt const");
	}
	
	public ConstuctorConcept(int i) {
		System.out.println("single param const");
		System.out.println("the value if i"+i);}
		
		public ConstuctorConcept(int i, int j) {
			System.out.println("two param const");
			System.out.println("the value if i"+i);
			System.out.println("the value if j"+j);
		
	}
	
	public static void main(String[] args) {
		ConstuctorConcept obj= new ConstuctorConcept();
		ConstuctorConcept obj1= new ConstuctorConcept(10);
		ConstuctorConcept obj2= new ConstuctorConcept(20); // No need to do obj. to call.
		
		}
	}


