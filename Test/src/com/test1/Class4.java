package com.test1;

public class Class4 {
	
	public boolean checkOrder(int A[]){
		int i = 0, j = 1;
		boolean order = true;
		
		while((order)&&(j<A.length)){
			if (A[i]>A[j])
				order = false;
			i++;j++;
		}
		
		return order;
	}
	
	public boolean solution(int A[]){
		
		boolean found = false;
		int i = 0, j = 1, aux = 0;
		
		if (checkOrder(A))
			found = true;
	
		while ((!found)&&(i<A.length)){
			while ((!found)&&(j<A.length)){
				
				if (A[i]>A[j]){
					aux = A[i];
					A[i] = A[j];
					A[j] = aux;
					
					if (checkOrder(A))
						found = true;
					else{ 
						aux = A[j];
						A[j] = A[i];
						A[i] = aux;
					}
				}
				j++;				
			}
			i++;j=i+1;
		}
		
		return found;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// true
		//int[] myArray = {1,3,5,3,7};
		// true
		//int[] myArray = {1,10,3,4,2};
		// true
		//int[] myArray = {1,1,2,3,9,5,4};
		// true
		//int[] myArray = {1,2,3,4};
		// false
		//int[] myArray = {11,10,3,4,2};
		//int[] myArray = {1,3,5,3,4};
		// true
		//int[] myArray = {1,5,3,3,7};
		// false
		int[] myArray = {1,3,5,3,4};
		
		Class4 c = new Class4();
		System.out.println(c.solution(myArray));
	}

}
