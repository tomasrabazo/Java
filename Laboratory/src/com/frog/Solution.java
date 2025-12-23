package com.frog;

public class Solution {
	
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
    	int newX = 0, jump = 0;
    	newX = X;
    	while (newX<Y) {
    		if (newX<Y) {
    			newX = newX + D;
    			jump++;
    		}
    	}
    	
    	return jump;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		
		System.out.println(solution.solution(10, 85, 30));
		
	}

}
