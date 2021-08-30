package Assisted;

public class Methods {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

//call by value
public int operation(int val) {
	
	val =val*10/100;
	return(val);
 
}

// method overloading
public void area(int b,int h)
{
     System.out.println("Area of Triangle : "+(0.5*b*h));
}
public void area(int r) 
{
     System.out.println("Area of Circle : "+(3.14*r*r));
}


public static void main(String[] args) {

	Methods b=new Methods();
	
	System.out.println("Multipilcation is :"+b.multipynumbers(10,3));
	
	System.out.println("Before operation value of data is 150 ");
	
	System.out.println("After operation value of data is "+b.operation(150));
	
	
	b.area(2,4);
	b.area(5);
	
	
	 
	}

}
