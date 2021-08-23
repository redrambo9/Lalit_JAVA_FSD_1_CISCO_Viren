package Day1_Assignment_1;

import Day1_Assignment.*;
public class Y extends N{        // Y is child of N now

	public static void main(String[] args) {
		
		
		
		
		X x1 = new X();
		// Accessing variable of X 
		System.out.println("Variable of X p1= "+x1.p1);
		System.out.println("Variable of X g= "+x1.g);
		System.out.println("Variable of X g1= "+x1.g1);
		
		// calling methods of N through inheritance property
		Y y1 = new Y();
		y1.displayprotected();
		y1.displaypublic();
		y1.displaydefault();
	
		
		// calling methods of M by creating obj of M;
		M m1 = new M();
		
		m1.displayprotected();
		m1.displaypublic();

	}

}
