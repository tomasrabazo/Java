package com.permutation;

public class Solution {
	/**
	 * @param args
	 *            the command line arguments
	 */
	void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("");
	}

	void permute(int[] a, int k) {
		int temp = 0;
			
		if (k == a.length)
			printArray(a);
		else
			for (int i = k; i < a.length; i++) {
				if (i != k) {
					System.out.println(i + "," + k);
					temp = a[k];
					a[k] = a[i];
					a[i] = temp;
				}
				permute(a, k + 1);
				if (i != k) {
					System.out.println(i + "," + k);
					temp = a[k];
					a[k] = a[i];
					a[i] = temp;
				}
			}
	}

	public static void main(String[] args) {
		Solution p = new Solution();
		int a[] = { 1, 2, 3 };
		p.permute(a, 0);
	}
}
