package lesson5.PrefixSums.CountDiv;

public class Solution {
	
	public int solution(int A, int B, int K) {
		
		int count = 0;
		for (int number = A; number<=B; number++)
			if (number % K == 0) count++;
		
		return count;
	}
	
	public static void main(String arry[]) {

		
		Solution sol = new Solution();
		System.out.println(sol.solution(0,11,3));

	}
}
