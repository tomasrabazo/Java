package com.test1;

public class Class5 {

	void calculateTime(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("");
	}

	void solution(int[] A, int last) {
		if (last == A.length)
			calculateTime(A);
		else
			for (int pos = last; pos < A.length; pos++) {
				int temp = A[last];
				A[last] = A[pos];
				A[pos] = temp;
				solution(A, last + 1);
				temp = A[last];
				A[last] = A[pos];
				A[pos] = temp;
			}
	}

	public static void main(String[] args) {
		Class5 p = new Class5();
		int a[] = {1,2,3};
		p.solution(a, 0);
	}

}
