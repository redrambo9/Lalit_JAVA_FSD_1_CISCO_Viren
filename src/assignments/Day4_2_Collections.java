package assignments;

import java.util.*;

public class Day4_2_Collections { // Based on Collection(HashSet,LinkedSet,Treeset)
	
public static void main(String [] args) {
		
		
		LinkedHashSet L1 = new LinkedHashSet<>();
		
		L1.add(2);
		L1.add(3);
		L1.add(4.5);
		L1.add(9.6);
		L1.add('a');
		L1.add('b');
		L1.add(true);
		System.out.println(L1);
		
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
		
		Scanner S = new Scanner(System.in);
		int n;
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		System.out.println("Enter the Number\n");
		n = S.nextInt();
		L2.add(n);
		
		System.out.println(L2);
		
		
		
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("C");
		ts.add("C++");
		ts.add("Java");
		ts.add("Python");
		ts.add("Java Script");
		ts.add("Angular Js");
		
		System.out.println("This is initial TreeSet\n"+ts);

		ts.remove("Python");
		ts.remove("C++");
		
		System.out.println("After Removing two Languages\n"+ts);
		
		ts.add("Scala");
		ts.add("Ruby");
		ts.add("Go");
		
		System.out.println("Does it contains Java : "+ts.contains("Java"));
		
		ts.clear();
		System.out.println("After Clearing");
		
		System.out.println(ts);
		
		
		
		
  }
}
