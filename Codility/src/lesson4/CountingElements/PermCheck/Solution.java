package lesson4.CountingElements.PermCheck;

import java.lang.Math;
import java.util.Arrays;

public class Solution {

	public int solution(int[] A) {
		
		int i=0, count = 0;
		boolean[] steps = new boolean[A.length];
		Arrays.fill(steps, Boolean.FALSE);
		
		while (i<A.length && A[i]<=steps.length){
			
			if (steps[A[i]-1]==false){
				steps[A[i]-1] = true;
				count++;
			}
			i++;
		}
		
		if (count==steps.length)
			return 1;
		else
			return 0;
	}

	public static void main(String arry[]) {

		//int[] number = { 1 }; // (1) -> 0
		//int[] number = { 1, 3, 1, 4, 2, 3, 5, 4 }; // (5) -> 6
		int[] number = { 1,3,20 }; // (5) -> -1
		
		Solution sol = new Solution();
		System.out.println(sol.solution(number));

	}
}
