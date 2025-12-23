package lesson3.TimeComplexity.PermMissingElem;

public class Solution {

	public int solution(int[] A) {
		
		int i = 0, total = 0, counter = 0;
		
		for (i=0;i<A.length;i++){
			total = total + A[i];
			counter = counter + i + 1;
		}
		i++;
		counter = counter + i;
		
		return counter - total;
	}

	public static void main(String arry[]) {

		int[] number = { 2, 3, 1, 5 };
		
		Solution sol = new Solution();
		System.out.println(sol.solution(number));

	}
}
