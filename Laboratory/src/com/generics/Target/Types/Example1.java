package com.generics.Target.Types;

import java.util.Collections;
import java.util.List;

public class Example1 {
	
	void processStringList(List<String> stringList) {
	    // process stringList
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static <T> List<T> emptyList();
		List<String> listOne = Collections.emptyList();
		
		List<String> listTwo = Collections.<String>emptyList();
		
		Example1 e = new Example1();
		
		e.processStringList(Collections.<String>emptyList());
	}

}
