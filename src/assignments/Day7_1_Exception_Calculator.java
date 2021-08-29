package assignments;
import java.util.*;

public class Day7_1_Exception_Calculator {
	
	public static long n,p;
	
	public long power(long n, long p) throws Exception{
		
		if(n < 0 || p < 0 ) {
			
			throw new Exception("Number Cannot be negative");
		}
		
		if(n==0 || p == 0) {
		  
			throw new Exception("Number Cannot be negative");
		 
		}
			
		
		return (long) Math.pow(n,p);
 }
	
	public static void main(String[] args) {
		
		Day7_1_Exception_Calculator c1 = new Day7_1_Exception_Calculator();
		
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter 1st Number");
		n = s.nextInt();
		System.out.println( "Enter 2nd Number");
		p = s.nextInt();
			try{  
		         System.out.println(c1.power(n, p))  ;
		       }
		       catch(Exception m)
		       {
		           System.out.println("Exception occured: "+ m.getMessage());
		       }
		}
}
