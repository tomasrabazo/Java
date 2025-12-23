package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	
	private final List<Integer> list1 = new ArrayList<Integer>();
	private final int COUNT=10;
	public Example1(){
		//list1.add(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 e1 = new Example1();
		//e1.COUNT = 2;
		//e1.list1 = new ArrayList<Integer>();
		e1.list1.add(new Integer(1));
		e1.list1.add(new Integer(2));
		
		System.out.println(e1.list1.get(0));
		System.out.println(e1.list1.get(1));
		
		//e1.list1 = new ArrayList<Integer>();
		String chain = "Hola";
		String chain2 = new String("Hola");
				
		System.out.println(chain);
		System.out.println(chain2);
		System.out.println(chain==chain2);
		System.out.println(chain.equals(chain2));
	}

}
