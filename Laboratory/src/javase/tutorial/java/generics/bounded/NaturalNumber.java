package javase.tutorial.java.generics.bounded;

public class NaturalNumber<T extends Integer> {
	
	private T n;

	public NaturalNumber(T n) {
		super();
		this.n = n;
	}
	
	public boolean isEven(){
		return n.intValue() % 2 == 0;
	}
	

}
