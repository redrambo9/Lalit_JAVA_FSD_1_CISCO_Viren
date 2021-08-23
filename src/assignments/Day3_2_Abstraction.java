package assignments;

abstract class MNC{ // Based on Abstraction and Inheritance
	 
	MNC(){
		System.out.println("Inside parent\n");
	}
	abstract void fun1();
	
	abstract void fun2();
	
	void normal1() {
		System.out.println("This is normal method of MNC\n");
	}
}
abstract class infosys extends MNC{
	

	void fun1() {
		System.out.println("Abstract method of fun1\n");
	}
	
	abstract void fun2();
	
}
class hello extends infosys{
	
	
	void fun2() {
		System.out.println("Abstract method of fun2\n");
	}
	
	
	void normal() {
		
		System.out.println("Normal method of Hello\n");
	}
}

public class Day3_2_Abstraction {
	public static void main(String [] args) {
		
		infosys obj = new hello();
		
		obj.normal1();
		obj.fun1();
		obj.fun2();
		
		hello obj2 = new hello();
		obj2.normal();
		
		
			
	}

}
