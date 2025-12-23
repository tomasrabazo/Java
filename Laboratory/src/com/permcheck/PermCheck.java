package com.permcheck;

import java.util.Arrays;

public class PermCheck {
	
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int i = 0;
    	
    	Arrays.sort(A);
    	
    	while (i < A.length) {
    	    if ((i+1)!=A[i++]) {
    	    	return 0;
    	    }
    	}
    	
    	return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,1,3,2};
		
		PermCheck permCheck = new PermCheck();
		System.out.println(permCheck.solution(A));
	}

}
