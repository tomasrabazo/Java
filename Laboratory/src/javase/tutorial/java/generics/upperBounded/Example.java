package javase.tutorial.java.generics.upperBounded;

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

	public static double sumOfList2(List<Number> list){
		double s = 0.0;
		for (Number n:list){
			s += n.doubleValue();
		}
		return s;
	}
	
	public static double sumOfList(List<? extends Number> list){
		double s = 0.0;
		for (Number n:list){
			s += n.doubleValue();
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1,2,3);
		System.out.println("Sum = " + sumOfList(li));
		
		List<Double> ld = Arrays.asList(1.2,2.3,3.4);
		System.out.println("Sum = " + sumOfList(ld));
		
		List<Number> li2 = Arrays.<Number>asList(1,2,3);
		System.out.println("Sum = " + sumOfList2(li2));
	}

}
