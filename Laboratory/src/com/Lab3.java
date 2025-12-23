package com;

import java.util.HashMap;
import java.util.Map;

public class Lab3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		NL_NL("nl", "nl", "NL", "Netherlands"), ok
		BE("be", "nl", "BE", "Belgium"),		ok
		NL_BE("benl", "nl", "BE", "Netherlands - Belgium"), ok
		FR_BE("befr", "fr", "BE", "France - Belgium"), 
		FR_FR("fr", "fr", "FR", "France"),
		DE_DE("de", "de", "DE", "Germany"),
		DE_AT("at", "de", "AT", "Germany - Austria"),
		EN_GB("uk", "en", "GB", "United Kingdom"),
		*/
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("nl", "Netherlands");
		unsortMap.put("be", "Belgium");
		unsortMap.put("benl", "Netherlands - Belgium");
		unsortMap.put("befr", "France - Belgium");
		unsortMap.put("fr", "France");
		unsortMap.put("de", "Germany");
		unsortMap.put("at", "Germany - Austria");
 
		System.out.println("Unsort Map......");
		OrderHashMap.printMap(unsortMap);
 
		System.out.println("\nSorted Map......");
		Map<String, String> sortedMap = OrderHashMap.sortByComparator(unsortMap);
		OrderHashMap.printMap(sortedMap);
	}

}
