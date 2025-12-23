package javase.tutorial.java.generics.capture;

import java.util.List;

public class WildcardErrorBad {
	
	void swapFirst(List<? extends Number> l1, List<? extends Number> l2){
		Number temp = l1.get(0);
		
		//l1.set(0, l2.get(0));
		//l2.set(0, temp);
	}

}
