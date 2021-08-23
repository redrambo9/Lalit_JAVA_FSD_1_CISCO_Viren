package assignments;

public class Day2_3_ParameterConstructor { // Based on parameterized constructor

	String name;
	int age;
	char sec;
	char gender;
	int sub1,sub2,sub3=0;
	
	
	public Day2_3_ParameterConstructor(int x, int y , int z){
		this.sub1=x;
		this.sub2=y;
		this.sub3=z;
	}
	public Day2_3_ParameterConstructor(int x, int y) {
		this.sub1 = x;
		this.sub2 = y;
	}
	
	float calculate() {
		
		return (float) (sub1+sub2+sub3)/3;
	}
	public static void main(String[] args) {
	
          Day2_3_ParameterConstructor s1 = new Day2_3_ParameterConstructor(50,60,70);
          System.out.println("Percentage of Student1 is : "+s1.calculate());
          
          Day2_3_ParameterConstructor s2 = new Day2_3_ParameterConstructor(55,65);
          System.out.println("Percentage of Student2 is : "+s2.calculate());
          
          Day2_3_ParameterConstructor s3 = new Day2_3_ParameterConstructor(65,75,80);
          System.out.println("Percentage of Student3 is : "+s3.calculate());
          
          Day2_3_ParameterConstructor s4 = new Day2_3_ParameterConstructor(75,85,95);
          System.out.println("Percentage of Student4 is : "+s4.calculate());

          
          
	}

}
