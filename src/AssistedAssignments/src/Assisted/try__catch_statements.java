package Assisted;

public class try__catch_statements {

    public static void main(String args[]) 
    {
        int a =7,b=0;
        try 
        {
           int c=  a/b;
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Divide by Zero"); 
        }
        finally 
        {
            System.out.println("Not Divided by Zero");
        }
    }
}
