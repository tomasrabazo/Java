package javase.tutorial.java.generics.inheritance;

/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/

public class Example {
	
	public void someMethod(Number n){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object someObject = new Object();
		Integer someInteger = new Integer(19);
		someObject = someInteger;
		
		Example e = new Example();
		e.someMethod(new Integer(19));
		e.someMethod(new Double(10.1));
		
		Box<Number> box = new Box<Number>();
		box.add(new Integer(10));
		box.add(new Double(10.1));
		
		Box2<String, String> pl1 = new Box2<String, String>(); 
		Box2<String, Integer> pl2 = new Box2<String, Integer>();
		Box2<String, Exception> pl3 = new Box2<String, Exception>();
	}

}
