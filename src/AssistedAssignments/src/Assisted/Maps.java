package Assisted;

import java.util.*;
public class Maps {

	public static void main(String[] args) {
		
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");
	      
	      System.out.println(hm);
	      
//	      for (String name : this.example.keySet()) {
//	    	    System.out.println(name);
//	    	}
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are "); 
	      System.out.println(ht);
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> tm=new TreeMap<Integer,String>();    
	      tm.put(8,"Annie");    
	      tm.put(9,"Carlotte");    
	      tm.put(10,"Catie");       
	      
	      System.out.println("\nThe elements of TreeMap are "); 
	      System.out.println(tm);
	      for(Map.Entry l: tm.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

