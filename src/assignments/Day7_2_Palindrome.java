package assignments;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Day7_2_Palindrome {
	

	public static void main(String[] args) {
		
		
		//Using StringBuilder class so that I can use reverse function else Use loop anc check the string
		
/*      StringBuilder input = new StringBuilder();
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter String");
		
		input.append(s.nextLine());
		
		//System.out.println(input);
		//System.out.println(input.reverse());
	
		
		if(input.equals(input.reverse())) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
 
 */     Scanner s = new Scanner(System.in);
        
        System.out.println("Enter String ");
     	String s1 = new String(s.nextLine());
     	boolean flag = true;
        for(int  i = 0 ; i < s1.length() ; i++) {
        	
        	if(s1.charAt(i)!= s1.charAt(s1.length() - i -1)) {
        		flag = false;
        		break;
        	}
        }
     	
     	if(flag) {}
     	else {
     		System.out.println("No");
     	}
		
		
	}

}
