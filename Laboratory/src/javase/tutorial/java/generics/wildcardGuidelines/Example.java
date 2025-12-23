package javase.tutorial.java.generics.wildcardGuidelines;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EvenNumber> le = new ArrayList<>();
		List<? extends NaturalNumber> ln = le;
		
		//ln.add(new NaturalNumber(10));
	}

}
