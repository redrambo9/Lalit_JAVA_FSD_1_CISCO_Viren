package Assisted;

import java.util.Scanner;

public class StringInputCalculator {
	
public static double a,res,b,;
	
	
	Calculator(){
	}
public int myfun(String input) {
	
	for(int  i = 0 ; i < input.length() ;i++) {
   	 if(input.charAt(i)=='+') {
   		 
   		 flag =2;
   		 cnt++;
   	 }
   	 if(input.charAt(i)=='+') {
  		 
  		 flag =2;
  		 cnt++;
  	 }
   	if(input.charAt(i)=='+') {
  		 
  		 flag =2;
  		 cnt++;
  		 
  	 }
   	if(input.charAt(i)=='+') {
  		 
  		 flag =2;
  		 cnt++;
  		 
  	 }
   	 else if(flag < 1){
   	 double num = input.charAt(i) - '0';
   	 
   	 a = a*10+num;
   	 }
   	 else {
   		 double num = input.charAt(i) - '0';
	    	 
	    	 b = b*10+num;
   	 }
   }
   
	
	
	
	return flag;
	
}
 double Addition(double a, double b) {
	 this.a=a;
	 this.b=b;
	 
	  return  a+b;
 }
 double Substraction(double a, double b) {
	  this.a=a;
	 this.b=b;
	 
	 return a-b;
 }
 double Multiply(double a, double b) {
	 this.a=a;
	 this.b=b;
	 
	 return a*b;
 }
 double  division(double a, double b) {
	 
	 this.a=a;
	 this.b=b;
	 
	 return a/b;
 }
	
	public static void main(String args[]) {
		
		
		Calculator c1 = new Calculator();
		//System.out.println(c1.Addition(5,4));
		
		 /*try {
			 
			 c1.division(5,0);
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Divide by Zero not possible");
			 
		 }*/
		String input;
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		//
	    System.out.println(input);
	    
	    
	    if(input.charAt(0)=='+' ||  input.charAt(0) == '-' || input.charAt(0) == '/' || input.charAt(0) =='*' )
	    {	
	    	System.out.println("Invalid Input Please Enter Again");
	    	input = s.nextLine();
	    }
	    
	    else {
	    	c1.myfun(input);
	    }
	    
	}


}
