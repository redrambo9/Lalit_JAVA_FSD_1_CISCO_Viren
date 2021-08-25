package assignments;

class Customer{
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		if(this.amount < amount) {
			
			System.out.println("Less Balance Waiting for Deposit");
			
		
		try {
			
			wait();
			
		}catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("Withdraw Completed.. The Left amount is "+this.amount);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		this.amount+=amount;
		
		System.out.println("Deposit Completed");
		notify(); // unlocking of thread
	}
	
}


public class Day6_Thread_Min_Wait {
	
	
		
		   public static void main(String args[]) {
			   final Customer c = new Customer() ;
			   
			   new Thread() {   // anonymous class
				   public void run() {
					   c.withdraw(5000);
				   }
			   }.start();
			   
			   new Thread() {   // anonymous class
				   public void run() {
				   c.withdraw(4000);	
				   }
		       }.start();
		   
			   
			   
			   new Thread() {
				   public void run() {
					   c.withdraw(10000);
				   }
			   }.start();
			   
			   new Thread() {   // anonymous class
				   public void run() {
					   c.deposit(20000);
				   }
			   }.start();
			   
		   }
		   


}
