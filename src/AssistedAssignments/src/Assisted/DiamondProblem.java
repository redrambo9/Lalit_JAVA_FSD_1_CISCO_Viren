package Assisted;


interface A 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface B 
{  
	
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class DiamondProblem implements A,B 
{  
    public void show() 
    {  
        A.super.show(); 
        B.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        DiamondProblem ob = new DiamondProblem(); 
        ob.show(); 
    } 
}

