package Assisted;
import java.util.*;

public class Collections {

  public static void main(String[] args) {
		
	  
	  // Creation of TreeSet
	  TreeSet<String> bs = new TreeSet<String>();
	  
	  
		bs.add("India");
		bs.add("USA");
		bs.add("Russia");
		bs.add("Nepal");
		bs.add("Bhutan");
		bs.add("China");
		System.out.println("TreeSet");
		System.out.println(bs);
	  
	  
	  //HashSet
      HashSet<Integer> hs=new HashSet<Integer>();  
      hs.add(101);  
      hs.add(103);  
      hs.add(102);
      hs.add(104);
      
      System.out.println("HashSet");
      System.out.println(hs);
      
      //LinkedHashSet
      LinkedHashSet<Integer> hs2=new LinkedHashSet<Integer>();  
      hs2.add(11);  
      hs2.add(13);  
      hs2.add(12);
      hs2.add(14);
      
      System.out.println("LinkedHashSet");
      System.out.println(hs2); 
	  
	  
	  //ArrayList
      ArrayList<String> Names =new ArrayList<String>();   
			
	  Names.add("Alex");
	  Names.add("John"); 
		      
	  System.out.println("ArrayList");
	  System.out.println(Names);  
			
      //Vector
	  Vector<Integer> v = new Vector<Integer>();
	  v.addElement(15); 
	  v.addElement(30);
		      
	  System.out.println("Vector");
	  System.out.println(v);
			
	  //creating Linkedlist
	  System.out.println("\n");
      System.out.println("LinkedList");
      LinkedList<String> L1=new LinkedList<String>();  
      L1.add("Alex");  
      L1.add("John");  	      
      Iterator<String> itr= L1.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());
       } 
  	}  
}



