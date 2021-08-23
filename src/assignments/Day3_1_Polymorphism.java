package assignments;

class vehicle { // Based on Dynamic Polymorphism & Inheritance
   
	int speed=10;
	int distance=20;
	
	vehicle(){
		 
	 }
	
	 vehicle(int x, int y){
		 speed = x;
		 distance = y;
	 }
	 
	 void run() {
		 System.out.print("Parent Vehicle running\n");
		 
	 }
	 
	 void stop() {
		 System.out.print("Parent Vehicle Stopped\n");
		 
	 }
	 public void fuel(int k) {
		 System.out.println(k);
	 }
	 
	 public void fuel(float f , int n) {
		 System.out.println(f +" " +n);
	 }
	 
	 public void fuel(char c, int p){
		 System.out.println(c +" " +p);
	 }

	void display() {
		System.out.println(speed+ " " +distance);
		
	}
	 
	 
	 
	 
}
class twoW extends vehicle{
	
	public int tyres = 2,speed = 50,distance = 100;
	twoW(){
		
	}
	void run() {
		 System.out.print("2W running\n");
		 
	 }
	 void stop() {
		 System.out.print("2W Stopped\n");
		 
	 }
	 void display() {
		 System.out.println(tyres+" " +speed +" " +distance);
		 
		 System.out.println(+super.speed +" " +super.distance);
		 
	 }
	
}
class threeW extends vehicle{
	
	public int tyres = 3, speed = 40, distance = 80;
	threeW(){
		
	}
	void run() {
		 System.out.print("3W running\n");
		 
	 }
	 void stop() {
		 System.out.print("3W Stopped\n");
		 
	 }
	 void display() {
		 System.out.println(tyres+" " +speed +" " +distance);
		 
		 System.out.println(+super.speed +" " +super.distance);
	 }
	
}
class fourW extends vehicle{
	
	public int tyres =4, speed = 30,distance =60;
	fourW(){
		
	}
	
	void run() {
		 System.out.print("4W running\n");
		 
	 }
	 void stop() {
		 System.out.print("4W Stopped\n");
		 
	 }
	 void display() {
		 System.out.println(tyres+" " +speed +" " +distance);
		 
		 System.out.println(+super.speed +" " +super.distance);
	 }
	
}
class eightW extends vehicle{
	
	public int tyres =8,speed =20,distance =40;
	
	eightW(){
		
	}
	
	void run() {
		 System.out.print("8W running\n");
		 
	 }
	 void stop() {
		 System.out.print("8W Stopped\n");
		 
	 }
	 void display() {
		 System.out.println(tyres+" " +speed +" " +distance);
		 
		 System.out.println(+super.speed +" " +super.distance);
	 }
	
}


public class Day3_1_Polymorphism {
	
	public static void main(String [] args) {
		
		vehicle v =  new vehicle();
		v.run();
		v.stop();
		v.fuel(5);
		v.fuel(2.3f,7);
		v.fuel('M',78);
		v.display();
		
		v = new twoW();
		v.run();
		v.stop();
		v.display();
		
		v = new threeW();
		v.run();
		v.stop();
		v.display();
		
		v = new fourW();
		v.run();
		v.stop();
		v.display();
		
		v = new eightW();
		v.run();
		v.stop();
		v.display();
		
		
		
	 }

}
