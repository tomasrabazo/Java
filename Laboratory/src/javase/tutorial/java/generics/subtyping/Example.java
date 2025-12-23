package javase.tutorial.java.generics.subtyping;

import java.util.ArrayList;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = new B();
		//A a = b;
		
		//A a = new A();
		//B b = (B) a;
		
		//List<B> lb = new ArrayList<>();
		//List<A> la  = lb;
		
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList;
		
		List<?> list = new ArrayList<>();
		List<? extends Number> list1 = new ArrayList();
		List<? extends Integer> list11 = new ArrayList();
		List<Integer> list12 = new ArrayList();
		
		list = list1;
		list1 = list11;
		list11 = list12;
		
		List<? super Integer> list2 = new ArrayList();
		List<? super Number>  list21 = new ArrayList();
		List<Number> list22 = new ArrayList();
		
		list2 = list12;
		list2 = list21;
		list21 = list22;	
		list1 =  list22;
		
		list21 = (List<? super Number>) list2;
	}

}
