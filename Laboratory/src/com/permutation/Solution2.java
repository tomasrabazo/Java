package com.permutation;

public class Solution2 {
	
	int count = 1;

	private void printArray(int[] a) {
		
		System.out.print(count++ + "-");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public void permute(int[] A, int Fixed) {
		int temp = 0;
		if (Fixed == A.length - 1) {
			printArray(A);
			return;
		}
		permute(A, Fixed + 1);
		for (int i = Fixed + 1; i < A.length; i++) {
			temp = A[Fixed];
			A[Fixed] = A[i];
			A[i] = temp;
			permute(A, Fixed + 1);
			temp = A[Fixed];
			A[Fixed] = A[i];
			A[i] = temp;
		}
	}

	public static void main(String[] args) {
		Solution2 p = new Solution2();
		//int a[] = { 1 };
		//int a[] = { 1, 2 };
		int a[] = { 1, 2, 3 };
		//int a[] = { 1, 2, 3, 4 };
		
		p.permute(a, 0);
	}

}
