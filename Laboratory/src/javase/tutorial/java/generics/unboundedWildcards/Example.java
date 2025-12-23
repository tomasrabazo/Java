package javase.tutorial.java.generics.unboundedWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/
public class Example {
	
	private static List<Object> listObj = new ArrayList<>();
	private static List<?> listObj2 = new ArrayList<>();
	
	public static void printList(List<Object> list){
		
		for (Object elem:list)
			System.out.println(elem + " ");
		System.out.println();
	}
	
	public static void insertList(Object object){
		
		listObj.add(object);
	}
	
	public static void insertList2(Object object){
		
		listObj2.add(null);
	}
	
	public static void printList2(List<?> list){
		
		for (Object elem:list)
			System.out.print(elem + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1,2,3,4);
		
		//Example.printList(li);
		
		Example.printList2(li);
		
		List<String> ls = Arrays.asList("one","two","three");
		
		Example.printList2(ls);
		
		Example.insertList(new Integer("0"));
	}

}
