package com.maxcounters;

import java.util.Arrays;

public class Solution {

	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
		int[] counters = new int[N];
		int maxcounter = 0;
		
		for (int pos=0;pos<A.length;pos++) {
			if (A[pos] == N + 1)
				for (int pos2=0;pos2<counters.length;pos2++) 
					counters[pos2] = maxcounter;
			if ((1<=A[pos])&&(A[pos]<=N))
			{
				counters[A[pos] - 1] += 1;
				if (counters[A[pos] - 1]>maxcounter)
					maxcounter = counters[A[pos] - 1];
			}
		}
		
		return counters;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = { 3, 4, 4, 6, 1, 4, 4 };
		// 1
		//int[] myList = { -1, -3, -7, 7 };

		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution(5, myList)));

	}

}
