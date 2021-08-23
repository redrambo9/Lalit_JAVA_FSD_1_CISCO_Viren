package assignments;

public class Day2_2_ConstructorOverload { // Based on Constructor Overloading
	
	private int i,l,b;
	float r;
	
	Day2_2_ConstructorOverload(){
		
	}
	
	Day2_2_ConstructorOverload(int i){
		this.i=i;
	}
	
	Day2_2_ConstructorOverload(int l, int b){
	  this.l=l;
	  this.b=b;
		
	}
	
	Day2_2_ConstructorOverload(float r){
		this.r= r;
	}
	
	int square() {
		
		return i*i;
	}
    
	int rectangle() {
		
		return l*b;
	}
	
	float circle() {
	
	  return (float) 3.14*r*r;
   }
   
   int area(int sum, int dis) {
	   
	   return (int) (0.1*sum*dis);
   }
   
   int area(int b, long h) {
	   
	   return  (int) (0.5*b*h);
   }
	

	public static void main(String[] args) {
		
		Day2_2_ConstructorOverload a1 = new Day2_2_ConstructorOverload(5);
		System.out.println(a1.square());
		
		Day2_2_ConstructorOverload a2 = new Day2_2_ConstructorOverload(5,2);
		System.out.println(a2.rectangle());
		
		Day2_2_ConstructorOverload a3 = new Day2_2_ConstructorOverload(2.2f);
		System.out.println(a3.circle());
		
		Day2_2_ConstructorOverload a4 = new Day2_2_ConstructorOverload();
		System.out.println(a4.area(10,4));
		
		Day2_2_ConstructorOverload a5 = new Day2_2_ConstructorOverload();
		System.out.println(a5.area(10,8L));
		
		
		

	}

}
