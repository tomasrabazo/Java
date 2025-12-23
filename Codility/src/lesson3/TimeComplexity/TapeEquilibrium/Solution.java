package lesson3.TimeComplexity.TapeEquilibrium;

import java.lang.Math;

public class Solution {

	public int solution(int[] A) {
		
		int i = 0, j = 0 , dif = 0, min =  Integer.MAX_VALUE, totalL = 0, totalR = 0;

		for (i=0;i<A.length-1;i++){
			totalL = totalL + A[i];
			if (i==0)
				for (j=i+1;j<A.length;j++){
					totalR = totalR + A[j];
				}
			else
				totalR = totalR - A[i];
			
			dif = Math.abs(totalL - totalR);
			if (dif<min)
				min = dif;
			//totalR = 0;
		}
		
		return min;
	}

	public static void main(String arry[]) {

		int[] number = { 3, 1, 2, 4, 3 }; // (1)
		//int[] number = { 4, 3, 5, 7, 2 }; // (3)
		//int[] number = { 1, 5, 9, 3, 4 };   // (8)
		//int[] number = { -1000, 1000 };   // (2000)
		
		Solution sol = new Solution();
		System.out.println(sol.solution(number));

	}
}
