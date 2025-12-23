package com;

public class Solution {

	private int sum1, sum2, diference, mindiference = 9999;

	public int solution(int[] A) {
		// write your code in Java SE 8
		for (int p = 1; p < A.length; p++) {
			
			sum1 = sum1 + A[p - 1];
			
			for (int p2 = p; p2 < A.length; p2++) {
				sum2 = sum2 + A[p2];
			}
			diference = (sum1 > sum2)?(sum1 - sum2):(-1)*(sum1 - sum2);
			System.out.println("P = " + p + ", difference = |" + sum1 + "-" + sum2 + "| = " + diference);
			if (diference<mindiference)
				mindiference = diference; 
			sum2 = 0;
		}

		return mindiference;
	}

	public static void main(String[] args) {
		
		int[] numbers = { 3, 1, 2, 4, 3 };		
		
		// TODO Auto-generated method stub
		Solution lab5 = new Solution();
		System.out.println(lab5.solution(numbers));

	}

}
