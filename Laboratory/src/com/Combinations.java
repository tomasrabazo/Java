package com;

public class Combinations {

	void printArray(int[] a, int r) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("");
	}

	public void combinaciones(int n, int r) {
		int i = 0, j = 0, ci = 0, p1 = 0;
		int v[] = new int[n];

		for (i = 0; i < n; i++) {
			v[i] = i;
		}

		printArray(v, r);
		ci++;
		while (ci < p1) {
			i = r - 1;
			while (v[i] == n - r + i) {
				i--;
			}

			v[i] = v[i] + 1;
			for (j = i + 1; j < r; j++) {
				v[j] = v[i] + j - i;
			}
			printArray(v, r);
			ci++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
