package Assisted;

public class TypeCasting {
	
public static void main(String[] args) {
		

		
		
		System.out.println("Explicit Casting");

	      double d = 100.44566;
	      System.out.println("Value of d :" +d);
	      
	      long l = (long) d;
	      System.out.println("Value of l :" +l);
	      
	      int i = (int) l;
	      System.out.println("Value of i :" +i);
	      
	     
	      
	      int i2 = 257;
	      System.out.println("Value of i2 :" +i2);
	      byte b = (byte) i2; // i2%256 will happen
	      System.out.println("Value of b :" +b);

		
		System.out.println("Implicit Casting");
		
		int f2 = 2879;
		System.out.println("Value of f2 :" +f2);
		float i3 = f2;
		System.out.println("Value of i3 :" +i3);
		
		char g = 'M';
		System.out.println("Value of g :" +g);
		int i4 = g;
		System.out.println("Value of i4 :" +i4);
		
		
	}
		
}
