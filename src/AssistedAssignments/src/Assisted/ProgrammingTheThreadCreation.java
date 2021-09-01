package Assisted;

class RunnableExample implements Runnable{  
	
	public void run(){
		System.out.println("Runnable thread is running..."); 
	}
	
} 

public class ProgrammingTheThreadCreation extends Thread{  
	
	public void run(){ 
		
	  System.out.println("Thread Class is running...");  
	  
	}  
	
	public static void main(String args[]){  
	
		ProgrammingTheThreadCreation t1=new ProgrammingTheThreadCreation();  //creating obj
	     t1.start();     //thread is starting
	     
	    // using runnable 
	 	RunnableExample m1=new RunnableExample();     // object of the class
		Thread t2 = new Thread(m1);                   // passing the object into the thread class constructor
		t2.start();                                   // thread starting 
  }  
	
}  
