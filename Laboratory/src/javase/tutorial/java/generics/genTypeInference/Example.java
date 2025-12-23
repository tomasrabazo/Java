package javase.tutorial.java.generics.genTypeInference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/
public class Example {
	
	static <T> T pick(T a1, T a2){
		return a2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type Inference
		Example example = new Example();
		Serializable s = example.pick("d", new ArrayList<String>());
		
		//Type Inference and Generic Methods
		
		//Type Inference and Instantiation of Generic Classes
		Map<String, List<String>> myMap = new HashMap<String, List<String>>();
		Map<String, List<String>> myMao2 = new HashMap<>();
		Map<String, List<String>> myMao3 = new HashMap();
		
		//Type Inference and Generic Constructors of Generic and Non-Generic Classes
		MyClass mc = new MyClass<Integer>("");
		MyClass<Integer> myObject = new MyClass<>("");
		
		//Target Types
		
	}

}
