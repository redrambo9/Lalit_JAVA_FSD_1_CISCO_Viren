package Assisted;
import java.util.*;

class def
{ 
  void display() // default access specifiers
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

class prvate 
{ 
   private void display() // private access specifiers
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

class prtected {

	protected void display() // protected access specifiers
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

class pubic {

	public void display() // public access specifiers
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}

public class AccessModifiers extends prtected{
	
	public static void main(String[] args) {
		
		System.out.println("Default Access Specifier");
		def obj = new def(); 		  
        obj.display(); // accessing default method of def class
        
        
        //System.out.println("Private Access Specifier");
		prvate  obj2 = new prvate(); 
		//obj2.display2(); cannot access
		
		//System.out.println("Protected Access Specifier");
		AccessModifiers obj3 =  new AccessModifiers();
		obj3.display();// accessing protected method of prtected class
		
		pubic obj4 = new pubic();
		obj4.display(); //accessing protected method of pubic class 
		
        

	}
}