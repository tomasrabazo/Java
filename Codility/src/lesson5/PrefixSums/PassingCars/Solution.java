package lesson5.PrefixSums.PassingCars;

import java.util.ArrayList;

public class Solution {
	
	public int solution(int[] A) {
		
		int lcar = 0, prevlcar = 0, rcar = 0, count = 0; 
		
		for (int pos = 0;pos<A.length;pos++)
			if ((A[pos] == 0)){
				if ((pos==A.length-1) || (pos>0 && A[pos - 1] == 1)){
					count = count + lcar * rcar + prevlcar * rcar;
					prevlcar = prevlcar + lcar;
					lcar = 0;rcar=0;
				}
		
				lcar++;
			}
			else if ((A[pos] == 1)  && (lcar>0)){
				rcar++;
				if (pos==A.length-1){
					count = count + lcar * rcar + prevlcar * rcar;
					prevlcar = prevlcar + lcar;
					lcar = 0;rcar=0;	
				}
			}
	
		
		if (count > 1000000000 || count < 0)
			return -1;
		else
			return count;
	}
	
	public static void main(String arry[]) {

		int[] number = { 0,0,1,1,1, 0,1,1, 0,0,1 }; // --> 17
		
		//int[] number = { 0,0,1,1,1,1,1 }; // --> 10

		//int[] number = { 1,0,1,0,1,0 }; // --> 3
		//int[] number = { 0,1,1,1,0 }; // --> 3
		//int[] number = { 1,0,1,1 }; // --> 2
		//int[] number = { 0,1,0,1,1 }; // --> 5
		//int[] number = { 0,1,0 }; // --> 1
		//int[] number = { 0 }; // --> 0
		//int[] number = { 1 }; // --> 0		
		
		Solution sol = new Solution();
		System.out.println(sol.solution(number));

	}
}
