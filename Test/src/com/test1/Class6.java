package com.test1;

public class Class6 {

	private void display(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public void permuta(int A[], int pos) {

		int aux = 0;

		if (pos == A.length - 1)
			display(A);
		else {
			permuta(A, pos + 1);

			aux = A[pos + 1];
			A[pos + 1] = A[pos];
			A[pos] = aux;
			
			display(A);
			permuta(A, pos + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 1, 2, 3 };
		Class6 c = new Class6();
		c.permuta(myArray, 0);
	}

}
