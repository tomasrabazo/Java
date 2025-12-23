package javase.tutorial.java.generics.lowerBounded;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/
public class Example {
	
	public static void addNumbers(List<? super Integer> list){
				
		for (int i=1;i<=10;i++){
			list.add(i);
		}
		
	}
	
	public static void printList(List<? super Integer> list){
		
		for (int i=0;i<=list.size()-1;i++){
			System.out.print(list.get(i));
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		
		Example.addNumbers(l1);
		Example.printList(l1);
		
		List<Number> l12 = new ArrayList<Number>();
		
		Example.addNumbers(l12);
		Example.printList(l12);

		List<Object> l13 = new ArrayList<Object>();
		
		Example.addNumbers(l13);
		Example.printList(l13);
	}

}
