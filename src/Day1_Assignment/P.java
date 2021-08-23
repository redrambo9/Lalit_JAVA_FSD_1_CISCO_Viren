package Day1_Assignment;


public class P{
	
	public void displaypublic() {
		
		System.out.println("This is Public method of Class P ");
		
	}
	protected void displayprotected() {
		System.out.println("This is protected method of Class P ");
	}
	
    void displaydefault() {
		System.out.println("This is default method of Class P ");
	}

	public static void main(String[] args) {
		
		M  m1  = new M();
		m1.displayprotected();
		m1.displaypublic();
		m1.displaydefault();
		
		
		N n1 = new N();
		
		n1.displayprotected();
		n1.displaypublic();
		n1.displaydefault();
	
		
		
		
		
		
		
	}

}
