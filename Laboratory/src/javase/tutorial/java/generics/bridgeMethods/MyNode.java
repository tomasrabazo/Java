package javase.tutorial.java.generics.bridgeMethods;

public class MyNode extends Node<Integer>{
	
	public MyNode(Integer data){
		super(data);
	}

	public void setData(Integer data) {
		// TODO Auto-generated constructor stub
		System.out.println("MyNode.setData");
		super.setData(data);
	}

}
