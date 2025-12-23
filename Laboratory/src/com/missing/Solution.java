package com.missing;

import java.util.HashMap;

public class Solution {
	
	private HashMap<Integer,Integer> createHM(int[] A) {
		 HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	      // Put elements to the map		 		 	     
	     for (int i = 0; i < A.length; i++) {
	         hm.put(i, A[i]);
	     }
	     
	     return hm;
	}

    public int solution(int[] A) {
        // write your code in Java SE 8 
    	boolean found = false;
    	int i = 0;
    	
    	HashMap<Integer, Integer> hm = createHM(A);
    	    	
    	while ((!found)&&(i <= A.length)) { 
    		i++;
    		if (!hm.containsValue(i))
    			found = true;    			
    	}
    	
    	return i;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 3, 1, 4};

		Solution sol = new Solution();
		System.out.println(sol.solution(A));
	}

}
