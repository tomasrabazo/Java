package javase.tutorial.java.generics.types.MultipleTypeParameters;

import javase.tutorial.java.generics.types.Example.Box;

public class Example {
	
	public class Box<T>{
		private T t;
		
		public void set(T t) { this.t = t; }
		public T get() { return t; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Tomas", 46);
		Pair<String, Integer> p2 = new OrderedPair<String, Integer>("Tomas", new Integer(46));
		Pair<String, String> p3 = new OrderedPair<String, String>("Tomas", "46");		
		Pair<Integer, Integer> p4 = new OrderedPair<>(1, 2);
				
		Example e = new Example();
		//Example.Box<Integer> box1 = e.new Box<Integer>(); 

		//Parameterized Types
		OrderedPair<String, Box<Integer>> p = new OrderedPair<>("Hola", e.new Box<Integer>());
		
		//Raw Types
		OrderedPair p5 = new OrderedPair(new Object(), new Object());
		
		OrderedPair p6 = p;
		
	}

}
