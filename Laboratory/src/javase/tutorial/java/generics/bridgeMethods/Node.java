package javase.tutorial.java.generics.bridgeMethods;

public class Node<T> {

	public T data;
	
	public Node(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	public void setData(T data){
		System.out.println("Node.setData");
		this.data = data;
	}

}
