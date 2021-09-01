package Assisted;

class innerClassAssisted {

private String msg="Inner Classes\n";

  void display(){
	  
	  class Inner{  
		 
		  void msg(){
			
			  System.out.println(msg);
		 }  
    }  
  
  Inner l=new Inner();  
  l.msg(); // calling msg method through obj of Inner 
 
  }
}

abstract class AnonymousInnerClass {
	
	   public abstract void display();
}

public class InnerClass {

	 private String msg="Welcome to Main Class"; 
	 
	 class Inner{ 
		 
	  void hello(){
		  
		  System.out.println(msg+", Let us start learning Inner Classes\n");
		}  
	 }  


	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello();  
		
		
		
		innerClassAssisted  ob=new innerClassAssisted ();  
		ob.display();  
		
		
		AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();


	}
}
