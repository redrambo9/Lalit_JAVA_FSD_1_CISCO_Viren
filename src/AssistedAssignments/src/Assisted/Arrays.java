package Assisted;

public class Arrays {

public static void main(String[] args) {

	//single-dimensional array
	int arr[]= {1,2,3,4,5};
	
	for(int i = 0 ; i < 5 ; i++) {
		System.out.println("Elements of array a: "+arr[i]);
	}


	//MultiDimensional array
	int[][] b = {
             {6, 7, 8, 9}, 
             {10, 11, 12} 
            };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      System.out.println("\nLength of row 2: " + b[1].length);
      }
}

