package lesson3.TimeComplexity.FrogImp;

public class Solution {
	/*
	public int solution(int X, int Y, int D) {
		int start = X;
		
		while (X<Y)
			X = X + D;

		return (X-start)/D;
	}
	*/
	public int solution(int X, int Y, int D) {
		return divideToCeil(Y - X, D);
	}

	int divideToCeil(int a, int b) {
		return a / b + ((a % b == 0) ? 0 : 1);
	}

	public static void main(String arry[]) {

		Solution sol = new Solution();
		System.out.println(sol.solution(10,85,30));

	}
}
