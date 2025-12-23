package com.countdiv;

public class Solution {
	
	public int solution(int A, int B, int K) {
        // write your code in Java SE 8
		int count = 0;
		for (int i=A ; i<=B; i++){
			if ((i % K) == 0)
				count++;
		}
		
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().solution(6, 11, 2));
	}

}
