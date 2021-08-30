package Assisted;
class Emp{
	
	int k = 4;
	
	void show() {
		System.out.println("Value of K is "+k);
	}
}

class Test{
int id = 0;
String name = "John";


// parameterized constructor
 Test(int k, String s2){
	
	id = k;
	name = s2;
 }

void display() {
	System.out.println(id +" " +name);
 }
}

public class Constructors {
	
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(); // default Constructor of class Emp is called.
		
		e1.show();
		
		Test t1 = new Test(4,"Alex"); // parameterized constructor of test class
		t1.display();
		
	}

}
