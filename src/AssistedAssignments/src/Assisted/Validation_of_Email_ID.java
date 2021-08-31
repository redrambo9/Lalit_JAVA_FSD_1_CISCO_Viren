package Assisted;

import java.util.*;



public class Validation_of_Email_ID {
	
	String search(ArrayList<String> ls ,String input) {
		if(ls.contains(input))
		return "Yes";
		else
		return "No";
	}
	
	
	
	
	public static void main(String[] args) {
		
	     ArrayList<String> MailId =new ArrayList<String>();   
			
		  MailId.add("Alex@gmail.com");
		  MailId.add("John28@gmail.com"); 
		  MailId.add("kumar@outlook.com");	
		  MailId.add("ammy67@yahoo.com");
		  MailId.add("devil_43@du.ac.in");
		  MailId.add("maven3@hotstar.com");
		  MailId.add("we@cisco.com");
		  
		  Scanner s = new Scanner(System.in);
		  
		  String input;
		  System.out.println("Enter you Email ID");
		  input = s.nextLine();
		  Validation_of_Email_ID obj = new Validation_of_Email_ID();
		  System.out.println(obj.search(MailId, input));
		
		
		
	}

}
