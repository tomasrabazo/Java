package com.test1;

public class Class3 {
	
	public class Node{
		int value = 0;
		Node next = null;			
		
		public Node(int val, Node n){
			this.value = val;
			this.next = n;
		}
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	
	public int solution(Node node){
		
		int count = (node!=null)?1:0;
		Node nAux = node;
		while (nAux.next!=null){
			nAux = nAux.next;
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class3 c3 = new Class3();

		Node node1 = c3.new Node(1, null);
		Node node2 = c3.new Node(2, null);
		Node node3 = c3.new Node(3, null);
		//Node node4 = c3.new Node(4, null);
		
		node1.setNext(node2);
		node2.setNext(node3);
		//node3.setNext(node4);
		
		System.out.println(c3.solution(node1));
	}

}
