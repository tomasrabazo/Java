package javase.tutorial.java.generics.QandE.genericsQuestions;

import java.util.Arrays;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> ci = Arrays.asList(1,2,3,4,5);
		int count = Algorithm.countIf(ci, new OddPredicate());
		System.out.println("Number of odd integers = " + count);
		count = 0;
		count = Algorithm.countIf(ci, new PrimePredicate());
		System.out.println("Number of prim integers = " + count);
		
	}

}
