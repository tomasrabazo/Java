package lesson2.Arrays.CyclicRotation;

public class Solution {

	public int[] solution(int[] number, int k) {

		int aux = 0;

		if (number.length == 0) return number;
		while (k != 0) {
			aux = number[number.length - 1];
			for (int pos = number.length - 1; pos > 0; pos--) {
				number[pos] = number[pos - 1];
			}
			number[0] = aux;
			k--;
		}

		return number;
	}

	public static void main(String arry[]) {
		int[] number = { 1, 2, 3, 4, 5 };
		//int[] number = { };
		Solution sol = new Solution();
		number = sol.solution(number, 6);

		for (int pos = 0; pos < number.length; pos++) {
			System.out.print(number[pos]);
		}
	}
}
