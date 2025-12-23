package javase.tutorial.java.generics.restrictions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Example {
	/*
	 * Cannot Create Instances of Type Parameters
	 *
	public static <E> void append(List<E> list){
		E elem = new E();
		list.add(elem);
	}
	*/
	/*
	public void print(Set<String> strSet){
		
	}
	*/

	public void print(Set<Integer> intSet){
		
	}
	/*
	public static <T extends Exception, J> void execute(List<J> jobs){
		try{
			for (J job : jobs){}
		}catch(T e){};
		
	}
	*/
	
	public static <E> void append(List<E> list, Class<E> cls)
	throws Exception {
		
		E elem = cls.newInstance();
		list.add(elem);
	}
	
	public static <E> void rtti(List<?> list){
		
		if (list instanceof ArrayList<?>){
			
		}
		
	}
	
	public static void main(String[] arg){
		// Cannot Instantiate Generic Types with Primitive Types.
		//Pair<int, char> p = new Pair<>(8, 'a');
		
		// Autoboxes
		Pair<Integer, Character> p2 = new Pair<>(8, 'a');
		
		Pair<Integer, Character> p3 = new Pair<>(Integer.valueOf(8), new Character('a'));
		
		List<String> ls = new ArrayList<>();
		try {
			append(ls, String.class);
			ls.get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Cannot Declare Static Fields Whose Types are Type Parameters
		int n1 = MobileDevice.numero;
		MobileDevice md1 = new MobileDevice();
		MobileDevice md2 = new MobileDevice();
		n1 = md1.numero;
		MobileDevice.numero = 3;
		n1 = md1.numero;
		n1 = n1;
		n1 = md2.numero;
		
		MobileDevice<Smartphone> phone = new MobileDevice<>();
		MobileDevice<Pager> pager = new MobileDevice<>();
		
		// Cannot Use Casts or instanceof with Parameterized Types
		ArrayList<Integer> ali = null;
		ArrayList<String> als = null;
		LinkedList<Character> llc = null;
		
		List[] S = {ali, als, llc};
		
		Example.rtti(S[0]);
		Example.rtti(S[1]);
		Example.rtti(S[2]);
		/*
		List<Integer> li = new ArrayList<>();
		List<Number> ln = (List<Number>)li;

		List<Integer> li2 = new ArrayList<>();
		List<? extends Number> ln2 = li2;
		
		List<String> l1 = new ArrayList<>();
		ArrayList<String> l12 = (ArrayList<String>) l1;
		
		// Cannot Create Arrays of Parameterized Types
		List<Integer>[] arrayOfLists = new List<Integer>[2];
		
		Object[] strings = new String[2];
		strings[0] = "hi";
		strings[1] = 100;
		
		Object[] stringLists = new List<String>[];
		stringLists[0] = new ArrayList<String>();
		stringLists[1] = new ArrayList<Integer>();
		*/
		// Cannot Create, Catch, or Throw Objects of Parameterized Types
		
	}
}
