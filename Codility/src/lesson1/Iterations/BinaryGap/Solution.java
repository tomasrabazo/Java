package lesson1.Iterations.BinaryGap;

public class Solution {

	public int solution(int number) {

		String stringnumber = Integer.toBinaryString(number);

		System.out.println(number + "-" + stringnumber);

		int size = stringnumber.length();
		int position = 0, zeros = 0, zerosAux = 0, oldvalue = 0;

		while (position < size) {
			if (stringnumber.charAt(position) == '0') {
				++zerosAux;
			} else if (position != 0)
				if (stringnumber.charAt(position - 1) == '0'){
					if (zerosAux > zeros)
						zeros = zerosAux;
					zerosAux = 0;
				}
			position++;
		}

		return zeros;
	}

	public static void main(String arry[]) {
		Solution sol = new Solution();
		System.out.println(sol.solution(1));
	}
}
