package Assisted;

import java.io.*; 
import java.util.*; 

class Sender 
{ 
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 

class Receieve extends Thread 
{ 
    private String msg; 
    private Thread t; 
    Sender  sender; 
    
    Receieve(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) // sync block to enter one thread at a time
        { 
            sender.send(msg); 
        } 
    } 
} 
public class ThreadSyncMechanism 
{ 
    public static void main(String args[]) 
    { 
        Sender snd = new Sender(); 
        
        Receieve r1 = new  Receieve( " Hi " , snd ); 
        Receieve r2 = new  Receieve( " Bye " , snd ); 
        
        r1.start(); // starting both the threads
        r2.start(); 
        
       /* try
        { 
            r1.join(); 
            r2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        }*/ 
    } 
} 
