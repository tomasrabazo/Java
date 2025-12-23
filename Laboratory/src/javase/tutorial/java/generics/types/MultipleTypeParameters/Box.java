package javase.tutorial.java.generics.types.MultipleTypeParameters;

public class Box<T>{
	private T t;
	
	public void set(T t) { this.t = t; }
	public T get() { return t; }
}
