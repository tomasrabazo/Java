package com.generics.typeInferenceAndInstantiationOfGenericClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {

	Map<String, List<String>> myMap = new HashMap<String, List<String>>();
	
	Map<String, List<String>> myMap1 = new HashMap<>();
	
	Map<String, List<String>> myMap2 = new HashMap(); // unchecked conversion warning
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
