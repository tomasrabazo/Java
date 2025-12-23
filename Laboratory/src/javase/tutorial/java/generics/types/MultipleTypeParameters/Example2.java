package javase.tutorial.java.generics.types.MultipleTypeParameters;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box rawBox = new Box();
		Box<Integer> intBox = rawBox;
		//------------------------------------
		Box<String> stringBox = new Box<>();
		Box rawBox2 = stringBox;
		rawBox2.set(8);
	}

}
