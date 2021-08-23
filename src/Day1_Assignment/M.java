package Day1_Assignment;

public class M {
   private int k = 25;
   long m = 56;
   protected float f = 2.98f;
   public char c = 'L';
   
   
   private void displayprivate() {
	   
	   System.out.println("Private Method of class M & k = "+k);
   }
   
   void displaydefault() {
	   
	   System.out.println("Default Method of class M & m = "+m);
   
   }
   public void displayprotected() {
	   
	   System.out.println("Protected Method of class M & f = "+f);
   
   }
   public void displaypublic() {
	   
	   System.out.println("Public Method of Class M & c = "+c);
	   
   }
   
   
}

