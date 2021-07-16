package selenium;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*int a[]=new int[5];
				a[0]= 10;
				a[1]= 20;
				a[2]= 30;
				a[3]= 40;
				
				System.out.println(a.length);*/
				
				String a[][]=new String[2][3];
				
				a[0][0] = "x";
				a[0][1] = "y";
				a[0][2] = "z";
				
				a[1][0] = "x1";
				a[1][1] = "y1";
				a[1][2] = "z1";
				
				System.out.println(a.length); //to find total no.  of rows which is 2
				System.out.println(a[0].length);//to find total no. of column which is 3
				
				System.out.println(a[1][0]); // to find value individualy 
				
				for(int row=0;row<a.length;row++) {
					for(int col=0;col<a[0].length;col++) {
						
					
					System.out.println(a[row][col]);
					
			
					}
				}
	}

}
