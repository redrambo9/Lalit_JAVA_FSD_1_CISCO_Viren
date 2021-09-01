package projects;
import java.io.File;

import java.io.IOException;
import java.util.*;

public class phase1 {
	
	public static void main(String[] args) {
		
		    TreeSet<String> ts = new TreeSet<String>();
		    
		    
			File file = new File("D://Directory");
			
			Scanner s = new Scanner(System.in);
			
			
			if(file.list()==null){
				
				System.out.println("No such directory or file");
			}
		
			else {
				
				String Names[] = file.list();
				for(int i = 0 ; i < Names.length ; i++) {
				
					ts.add(Names[i]);
				}
			}
			
			char ch;
		    do {
		    	System.out.println("1.Display Files(Sorted Order)\n2.Add a File\n3.Delete File\n4.Search File\n5.Exit");
		    	int x = s.nextInt();
		    	switch(x){
		    	 
		    	case 1:
		    		if(file.exists()){
					
					 if(ts.size()==0)// if directory is there but no file in it
						System.out.println("Empty Directory");
					 
					 else {
						
						Iterator<String> itr = ts.iterator();
						 
						while(itr.hasNext()){
						    System.out.println( itr.next() );
						}
					  }
		    		}
		    		
		    		else {
		    	    	
					  System.out.println("No such directory or file");
					}
		    		break;
		    		
		    	case 2:
		    		
		    		String blank,filename;
		    		
		    		System.out.println("Enter the file name with extension(.txt/.pdf etc)");
		    		blank = s.nextLine();// ignore newline
		    		filename = s.nextLine();
		    		
		    		File f = new File(file.getPath(),filename);
		    		  try {
						 
		    			  f.createNewFile();
					      ts.add(filename);
					      System.out.println(filename +" is added");
					      
					   }catch (IOException e) {
						
						   e.printStackTrace();
					   }
		    		  break;
		    	case 3:
		    		
		    		String blank3,del;
		    		System.out.println("Enter the file name you want to Delete(with extension)");
		    		blank3 = s.nextLine();//ignore newline
		    		del = s.nextLine();
		    		
		    	    if(!ts.contains(del))
		    	    	System.out.println("Already Not present in Directory");
		    	    else
		    	    {
		    	    	File f1 = new File(file.getPath(),del);
		    	    	f1.delete();
		    	    	System.out.println("Deleted");
		    	    	ts.remove(del);
		    	    }
		    	
		    		break;
		    	case 4:
		    		String blank2,search;
		    		System.out.println("Enter the file name you want to search(with extension)");
		    		blank2 = s.nextLine();// ignore new line
		    		search = s.nextLine();
		    		
		    		if(ts.contains(search)){ 
		    			
		    			
		    			System.out.println("Present in Directory");
		    		
		    		}
		    		
		    		else 
		    			System.out.println("Not Present");
		    		
		    		break;
		    	case 5:
		    		System.exit(0);
		    		break;
		    		}
		    	
		    	//ch = 'Y';
		    	//if you don't want to take input from user ever time uncomment above one line and comment below two lines.
		    	System.out.println("Enter Y or y to continue");
		    	ch = s.next().charAt(0);
		      }while(ch == 'Y' || ch == 'y');
					
		
	}
}
