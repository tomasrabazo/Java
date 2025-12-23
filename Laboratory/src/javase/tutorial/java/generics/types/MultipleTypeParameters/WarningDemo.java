package javase.tutorial.java.generics.types.MultipleTypeParameters;

public class WarningDemo {
	
	public static Box createBox(){
		return new Box();
	}

	@SuppressWarnings("checked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> bi,bi2;
		bi = createBox();
		bi2 = WarningDemo.createBox();
	}

}
