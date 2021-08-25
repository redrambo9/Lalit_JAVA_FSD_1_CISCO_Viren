package assignments;
import java.util.*;
public class Day5_Strings {
	
	
	public static void main(String[] args) {
		
		// new string will create obj both in pool & heap
		// string will create obj in pool only
		// pool will not create obj if it already have that string but heap will
		
		
		String t = "Delhi";
		String o = "Mumbai";
		String k = "delhi";
		String y = new String("Mumbai");
		String l = new String("delhi");
		String p = new String("hello");
		
		// 4 obj in pool and 3 in heap
		
		if(o.equals(l))
			System.out.print("O and L are same String\n");
		else
			System.out.print("O and L are not same String\n");
		
		if(t.equals(o))
			System.out.print("O and T are same String\n");
		else
			System.out.print("O and T are not same String\n");
		
		if(k.equals(y))
			System.out.print("K and Y are same String\n");
		else
			System.out.print("K and Y are not same String\n");
		
		if(p.equals(y))
			System.out.print("P and Y are same String\n");
		else
			System.out.print("P and Y are not same String\n");
		
		
		
		if(o==l)
			System.out.print("O and L share same memory address\n");
		else
			System.out.print("O and L do not share same memory address\n");
		
		if(y==p)
			System.out.print("Y and P share same memory address\n");
		else
			System.out.print("Y and P do not share same memory address\n");
		
		if(t==o)
			System.out.print("T and O share same memory address\n");
		else
			System.out.print("T and O do not share same memory address\n");
		
		if(k==y)
			System.out.print("K and Y share same memory address\n");
		else
			System.out.print("K and Y do not share same memory address\n");
		
		if(p==y)
			System.out.print("P and Y share same memory address\n");
		else
			System.out.print("P and Y do not share same memory address\n");
		
			
		
		
	}
	

}
