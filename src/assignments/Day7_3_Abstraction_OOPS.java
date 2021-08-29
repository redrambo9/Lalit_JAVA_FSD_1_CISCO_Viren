package assignments;
abstract class pen{
	
	abstract void write();
	abstract void refill();
}
class fountainpen extends pen{
	
	void changeNib() {
		System.out.println("Nib Changed");
	}
	void write() {
		System.out.println("Pen is writing");
	}
	void refill() {
		
		System.out.println("Pen is getting refilled");
	}
}
class monkey{
	public void jump() {
		
		System.out.println("Monkey is Jumping");
	}
	
	public void bite() {
		System.out.println("Monkey is biting");
	}
	
	
}
interface animal{
	
   public void sleep(); 
    
   public void eat();
}

class human extends monkey implements animal{
	
    public void sleep() {
		
		System.out.println("Human is sleeping");
	}
    
    public void eat() {
	
	System.out.println("Human is Eating");
    }
	
}
public class Day7_3_Abstraction_OOPS {
	
	 public static void main(String[] args) {
		 
		 //System.out.println("Part 1 of Assignemnt : Abstraction Concept");
		 fountainpen p1 = new fountainpen(); 
		 p1.write();
		 p1.refill();
		 p1.changeNib();
		 
		 //System.out.println("Part 2 of Assignemnt : Polymorphism Concept");
		 
		 monkey m1 = new monkey();
		 m1.jump();
		 m1.bite();
		 
		 
		 human n1 = new human();
		 n1.eat();
		 n1.sleep();
		 
		 
		 
		 
	 }

}
