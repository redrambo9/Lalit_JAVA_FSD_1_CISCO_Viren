package assignments;
import java.util.*;
public class Day8_Stack {
 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		Stack<Integer> ss = new Stack<Integer>();
		
		System.out.println("Insert any five elements");
		for(int i = 1 ; i <=5 ; i++) {
		int n = s.nextInt();
		
		 ss.push(n);
		}
		
		System.out.println("Popping two elements");
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		
		System.out.println("Top element is : " +ss.peek());
		
		
		System.out.println(ss.search(24));
		
		
		
	}
	
	
	
}
