package com.missingInteger;

import java.util.Arrays;

public class Solution {

	public int solution(int[] A) {
		
		int pos = 0, num = 0, count = 0;
		
		Arrays.sort(A);
		
		while (pos < A.length) {
			num = A[pos++];
			if (num>0) 				
				if ((num - count)==1)
					count++;
				else if ((num - count)!=0)
					return ++count;
		}

		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5
		//int[] myList = { -1, 3, 6, 4, 1, 2 };
		// 5
		//int[] myList = { 1, 3, 6, 4, 1, 2 };
		// 2
		int[] myList = { 1, 3, 7 };
		// 1
		//int[] myList = { -1, -3, -7, 7 };

		Solution sol = new Solution();
		System.out.println(sol.solution(myList));

	}

}
