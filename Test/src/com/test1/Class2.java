package com.test1;

import java.util.HashMap;
import java.util.Map;

public class Class2 {

	public int solution(int A[]){
		
		Map<Integer, Integer> repeatationMap= new HashMap<Integer,Integer>();
		
		for (int pos=0;pos<A.length;pos++){
			if (repeatationMap.containsKey(A[pos]))
				repeatationMap.put(A[pos], repeatationMap.get(A[pos]) + 1);
			else
				repeatationMap.put(A[pos], 1);
		}
		
		for(int key : repeatationMap.keySet()){
	        if(repeatationMap.get(key) > (A.length/2)) {
	            return key;
	        }
	    }
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//int[] myArray = {1, 1, 1, 50, 1};
		int[] myArray = {4,2,2,3,2,4,2,2,6,4};
		
		Class2 c = new Class2();
		System.out.println(c.solution(myArray));

	}

}
