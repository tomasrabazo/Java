package com.concurrent.example1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static int getHashCode(String data){
		
		StringBuilder builder = new StringBuilder();
	    builder.append(data);

	    return builder.toString().hashCode();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> pathMap = new HashMap<Integer, String>();
		String []chain = {"Tomas", "tomas"};			
		
		for (int i=0;i<chain.length;i++){
			System.out.println(HashMapExample.getHashCode(chain[i]));
			pathMap.put(HashMapExample.getHashCode(chain[i]), chain[i]);
		}
		
		
		System.out.println(pathMap.containsKey(HashMapExample.getHashCode("tomaS")));
		 	    
		
	}

}
