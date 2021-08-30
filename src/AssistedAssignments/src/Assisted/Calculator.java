package Assisted;
import java.util.*; 
import java.io.*;
public class Calculator {
	
	public double a,res,b;
	
	
	Calculator(double a, double b){
		this.a=a;
		this.b=b;
	}

 double Addition() {
	
	 
	  return  a+b;
 }
 double Subtraction() {
	 
	 
	 return a-b;
 }
 double Multiplication() {
	
	 return a*b;
 }
 double  Division() throws Exception {
	 
	 if(b==0)
		 throw new Exception("Divide by Zero");
	  
	 
	 return a/b;
 }
	
	public static void main(String args[]) {
		
		
		Scanner s = new Scanner(System.in);
		
		double num1,num2;
		
		System.out.println( "Enter 1st Number");
		num1 = s.nextInt();
		
		System.out.println( "Enter 2nd Number");
		num2 = s.nextInt();
		Calculator c1 = new Calculator(num1,num2);
		
		System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		int ch = s.nextInt();
		
		switch(ch){
		
			case 1:
				System.out.println(c1.Addition());
				break;
			
			case 2:
				System.out.println(c1.Subtraction());
				break;
			case 3:
				System.out.println(c1.Multiplication());
				break;
			case 4:
				
				try{  
			         System.out.println(c1.Division());
			       }
			       catch(Exception m)
			       {
			           System.out.println("Exception occured: "+ m.getMessage());
			       }
				break;
				
			default: 
				System.out.println("Invalid Option\n");
		 
	  }
		
	    
	}

}
