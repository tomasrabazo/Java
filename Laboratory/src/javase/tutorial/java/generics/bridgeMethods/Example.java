package javase.tutorial.java.generics.bridgeMethods;

public class Example {

	public Example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyNode mn = new MyNode(5);
		Node n = mn;
		n.setData("Hello");
		Integer x = mn.data;
	}

}
