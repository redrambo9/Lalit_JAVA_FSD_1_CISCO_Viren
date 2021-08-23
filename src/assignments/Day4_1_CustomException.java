package assignments;

public class Day4_1_CustomException {// Based on CustomException
    
	static void salary(int sal) throws MessageSalaryException {
		if(sal < 2000)
			throw new MessageSalaryException("Need to work hard\n");
			
		else if(sal >2000 & sal <5000)
			throw new MessageSalaryException("Somehow Good\n");
			
		else if(sal > 5100 & sal < 9000)
			throw new MessageSalaryException("Good Salary\n");
	}
	public static void main(String arg[]) {
		try {
			salary(1000);
		}
		catch(Exception m) {
			System.out.println("Exception Occured is :" +m.getMessage());
		}
		System.out.println("Rest of Code\n");
	}
}
class MessageSalaryException extends Exception{
	MessageSalaryException(String s){
		super(s);
	}
}