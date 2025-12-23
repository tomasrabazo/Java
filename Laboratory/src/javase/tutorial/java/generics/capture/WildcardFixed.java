package javase.tutorial.java.generics.capture;

import java.util.List;

public class WildcardFixed {
	
	void foo(List<?> i){
		fooHelper(i);
	}
	
	private <T> void fooHelper(List<T> l){
		l.set(0, l.get(0));
	}

}
