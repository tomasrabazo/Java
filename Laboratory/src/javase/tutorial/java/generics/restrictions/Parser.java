package javase.tutorial.java.generics.restrictions;

import java.io.File;

public class Parser<T extends Exception> {

	public void parse(File file) throws T {
		
	}
}
