package Assisted;
import java.util.*;

public class LongestIncreasingSubsequence  {
	 
	
	static void myfun(int[] arr)
	    {
	    
	        List <List<Integer>> LIS = new ArrayList<>();// list inside list to store the LIS upto i;
	        
	        int mx = 0;
	        
	        for (int i = 0; i < arr.length; i++) {
	            
	        	LIS.add(new ArrayList<>());
	        }
	 
	  
	        LIS.get(0).add(arr[0]);// initialized with first element of array
	 
	        
	        for (int i = 1; i < arr.length; i++)
	        {
	            
	            for (int j = 0; j < i; j++)
	            {
	                
	               
	                if (arr[i] > arr[j] && LIS.get(j).size() > LIS.get(i).size()) // to check whether current element can be added to make LIS
	                {
	                    LIS.set(i, new ArrayList<>(LIS.get(j)));// add the previous longest list
	                }
	            }
	 
	            
	            LIS.get(i).add(arr[i]);// add the current element to list who is making LIS
	        }
	 
	        
	        
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (LIS.get(mx).size() < LIS.get(i).size()) {// to find the longest list inside the LIST LIS
	                mx = i;
	            }
	        }
	 
	       
	        System.out.print("The Longest Increasing Subsequence is :" +LIS.get(mx));

	    }


	public static void main(String[] args) {
		
		int[] arr = {10,22,33,21,50,41,60,80,1};
		 
        myfun(arr);
		
		}
	
	
    }
		
	
	

	
	/*int a[] = {10,20,9,33,21,50,41,60,80,1};
	
	int []dp = new int[10];
	
	int res = 0;
	
	
	for(int i = 0  ; i < dp.length; i++) {
		
		int mx = 0;
		for(int  j = 0 ; j < i ; j++) {
			
			if(a[i] > a[j]) {
				
				if(dp[j] > mx) {
					
					mx = dp[j];
				}
			}
		}
		dp[i] = mx+1;
		
		if(dp[i] > res)
			res=dp[i];
	}
	
	System.out.println("The length of LIS is "+res);
	
	
	
	
}*/