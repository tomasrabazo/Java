package com.test1;

public class Class1 {
	
	public int solution(int A[]){
		
		int lsum = 0, rsum=0;
		
		for (int P=0;P<A.length;P++){
			
			lsum = 0; rsum=0;
			for (int l=0;l<P;l++){
				lsum += A[l];
			}
			
			for (int r=P+1;r<A.length;r++){
				rsum += A[r];
			}
			
			if (lsum==rsum)
				return P;										
		}					
		
		return -1; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {-1,3,-4,5,1,-6,2,1};
		
		Class1 c = new Class1();
		System.out.println(c.solution(myArray));
	}

}
