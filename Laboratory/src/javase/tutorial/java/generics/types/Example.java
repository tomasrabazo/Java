package javase.tutorial.java.generics.types;

//https://docs.oracle.com/javase/tutorial/java/generics/types.html

/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/

public class Example {
	
	public class Box0 {
	    private Object object;

	    public void set(Object object) { this.object = object; }
	    public Object get() { return object; }
	}
	
	public class Box<T>{
		private T t;
		
		public void set(T t) { this.t = t; }
		public T get() { return t; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example e = new Example();
		Example.Box<Integer> box1 = e.new Box<Integer>();
		
	}

}
