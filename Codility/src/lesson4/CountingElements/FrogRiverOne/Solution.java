package lesson4.CountingElements.FrogRiverOne;

import java.lang.Math;
import java.util.Arrays;

public class Solution {

	public int solution(int X, int[] A) {
		
		int i=0, s = 0;
		boolean finished = false;
		boolean[] steps = new boolean[X];
		Arrays.fill(steps, Boolean.FALSE);

		while (!finished && i<A.length){
			
			steps[A[i]-1] = true;
			
			while (s<steps.length && steps[s]){
				s++;
				if (s==steps.length)
					finished = true;
			}
			if (!finished) i++;
		}
		
		if (!finished) i = -1;

		return i;
	}

	public static void main(String arry[]) {

		//int[] number = { 1 }; // (1) -> 0
		//int[] number = { 1, 3, 1, 4, 2, 3, 5, 4 }; // (5) -> 6
		int[] number = { 3 }; // (5) -> -1
		
		Solution sol = new Solution();
		System.out.println(sol.solution(5, number));

	}
}
