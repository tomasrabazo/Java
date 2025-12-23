package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OrderHashMap {

	public static Map<String, String> sortByComparator(Map<String, String> unsortMap) {
		 
		// Convert Map to List
		List<Map.Entry<String, String>> list = 
			new LinkedList<Map.Entry<String, String>>(unsortMap.entrySet());
 
		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
 
		// Convert sorted map back to a Map
		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
		for (Iterator<Map.Entry<String, String>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, String> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
 
	public static void printMap(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
		}
	}

}
