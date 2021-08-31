package Assisted;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Handling {
	public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	char ch;
	do {
	System.out.println("1.Write & Append\n2.Read");
	int x = s.nextInt();
	
	
	switch(x){
	
	   case 1:
	
	   try {
		 
		 String inp,inp2;
		 System.out.println("Write the content into file");
		 inp2 = s.nextLine();// to ignore the new line
		 inp = s.nextLine(); // User have to write into file

		 FileWriter output = new FileWriter("C://Users//Anonymous//Downloads//notepad.txt",true);
		 output.write(inp);
	    
		 System.out.println("Data is written into file is :"+inp);
	    
		 output.close();
	   }catch(Exception e) {
		   
		e.getStackTrace();
	   }
	   break;
	
	   case 2:
			
		try {
		
		FileReader input = new FileReader("C://Users//Anonymous//Downloads//notepad.txt");
			
		char[] array = new char[45];
		
		
		input.read(array);
		
		// initially the file is empty so will print nothing.
		System.out.print("Data in File is :");
		System.out.println(array);
		
		input.close();
		 }catch(Exception e) {
			 
			 e.getStackTrace();
		}
		break;
		
	   default:
		   System.out.print("Invalid Entry");
		   }
    	System.out.println("Do you want to continue (Type y or n)");
    	ch = s.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}


