package com.generics.Type.Inference.and.Generic.Constructors.of.Generic.and.NonGeneric.Classes;

public class Example1 {

	class MyClass<X> {
		<T> MyClass(T t) {
			// ...
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e = new Example1(); 
		
		MyClass<Integer> a = e.new MyClass<Integer>("");
		
		MyClass<Integer> myObject = e.new MyClass<>("");
	}

}
