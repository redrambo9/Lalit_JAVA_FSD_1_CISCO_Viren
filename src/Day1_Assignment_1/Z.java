package Day1_Assignment_1;
import Day1_Assignment.*;
public class Z extends M {  // Z is child of M now.
 
	public static void main(String[] args) {
		
		X x1 = new X();
		
		
		// Accessing variable of X 
		System.out.println("Variable of X p1= "+x1.p1);
		System.out.println("Variable of X g= "+x1.g);
		System.out.println("Variable of X g1= "+x1.g1);
		
		// calling methods of M through inheritance property
				Z z1 = new Z();
				z1.displayprotected();
				z1.displaypublic();

			
				
				// calling methods of N by creating obj of N;
				N n1 = new N();
				
				n1.displayprotected();
				n1.displaypublic();
				n1.displaydefault();
				
				// calling all methods of class P;
				
				P pob = new P();
				
				pob.displaypublic();
				
				
				
	}

}
