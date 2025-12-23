package lesson4.CountingElements.MissingInteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int solution(int[] A) {
		Set<Integer> numbers = new HashSet<Integer>();
		for (int number : A) {
			numbers.add(number);
		}
		for (int i = 1;; i++) {
			if (!numbers.contains(i)) {
				return i;
			}
		}
	}

	public static void main(String arry[]) {
		//int numero = -2147483648;
		
		//System.out.println(numero - 1);
		
		
		//int[] number = {-2147483648, 2147483647}; // -> 1
		//int[] number = {4, 5, 6, 2}; // -> 1
		//int[] number = { -1 }; // -> 1
		//int[] number = { 0 }; // -> 1
		//int[] number = { 1 }; // -> 2
		int[] number = { 1,3,6,4,1,2 }; // -> 5
		
		Solution sol = new Solution();
		System.out.println(sol.solution(number));

	}
}
