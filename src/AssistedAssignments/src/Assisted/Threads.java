package Assisted;


public class Threads extends Thread
{
 	public void run()
 	{
  		System.out.println("Concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Threads mt = new  Threads();
  		mt.start();
 	}
}


