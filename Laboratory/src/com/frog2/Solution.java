package com.frog2;

public class Solution {
	
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
    	
    	boolean found = false;
    	int pos = -1;
    	
    	while ((!found)&&(++pos<A.length)) {
    		
            if (A[pos] == X)
            	found = true;
            	
    	}    	
    	
    	if (!found)
    		return -1;
    	else
    		return pos;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		
		Solution sol = new Solution();
		System.out.println(sol.solution(5, A));

	}

}
