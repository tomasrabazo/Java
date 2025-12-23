package com.generics.typeInference;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference1 {
	
	static <T> T pick(T a1, T a2) { return a2; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serializable s = pick("d", new ArrayList<String>());
	}

}
