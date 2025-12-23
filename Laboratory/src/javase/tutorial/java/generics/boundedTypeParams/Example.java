package javase.tutorial.java.generics.boundedTypeParams;

public class Example {

	
	public static <T extends java.lang.Comparable<T>> int countGreaterThan(T[] anArray, T elem){
		
		int count = 0;
		for (T e : anArray) {
			if (e.compareTo(elem)>0)
				++ count;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] integerArray = new Integer[]{1,2,3,4,5};
		//Integer[] integerArray = {new Integer(1),new Integer(2),new Integer(3)};
		Integer int1, int2;	
		int1= new Integer("1");
		int2= new Integer("2");
		
		System.out.println(Example.countGreaterThan(integerArray, 10));
		System.out.println(Example.countGreaterThan(integerArray, int1));
	
	}

}
