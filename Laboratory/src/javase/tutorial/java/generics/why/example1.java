package javase.tutorial.java.generics.why;

import java.util.ArrayList;
import java.util.List;

//https://docs.oracle.com/javase/tutorial/java/generics/why.html
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Hello");
		String s = list.get(0);
		
		System.out.println(s);
	}

}
