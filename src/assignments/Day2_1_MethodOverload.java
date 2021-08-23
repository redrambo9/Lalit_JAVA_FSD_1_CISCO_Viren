package assignments;

public class Day2_1_MethodOverload { // Based on method overloading
	
	private int x,y,r;
	
	
	public int calculate(int x, int y) {
	
		return x+y;
	}
	
	public float calculate(int r) {
		
		return (float) (3.14*r*r);
	}
	
   public int calculate(int l, long b) {
		
		return (int) (l*b);
	}
	

   
	public static void main(String[] args) {
		
          Day2_1_MethodOverload obj = new Day2_1_MethodOverload();
         
          
          System.out.println(obj.calculate(5,4)); 
          
          System.out.println(obj.calculate(2));
          
          System.out.println(obj.calculate(5,4L));
          
          
	}

}
