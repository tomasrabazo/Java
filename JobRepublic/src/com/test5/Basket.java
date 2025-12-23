package com.test5;

public class Basket {
	
	private Item[] list1 = null;
	private Item[] list2 = null;
	
	private int totalPrice = 0;
	
	private void swap(Item[] listA, Item[] listB, int n, Item i, int nlist){
		
		listB = new Item[listA.length + n];
		int pos = 0;
		
		// Copy on arryA to arrayB
		for (pos = 0;pos<listA.length;pos++){
			listB[pos] = new Item(listA[pos].getName(),listA[pos].getPrice());
			listA[pos] = null;
		}
		listA=null;
		// Add to arrayB new Items.
		for (int posB = pos;posB<listB.length;posB++)
			listB[posB] = new Item(i.getName(),i.getPrice()); 
		
		// swap
		if (nlist==1){
			list1=listA;
			list2=listB;		
		}else{
			list2=listA;
			list1=listB;	
		};
	}
	
	public void add(Item i, int n){
		totalPrice = totalPrice + i.getPrice() * n;
		
		if (list1==null && list2==null){
			list1 = new Item[n];	
			for (int pos = 0;pos<list1.length;pos++)
				list1[pos] = new Item(i.getName(),i.getPrice()); 
		}
		else
		if (list1!=null && (list1.length>0 && list2==null)){
			swap(list1, list2, n, i, 1);
		}
		else
		if (list2!=null && (list1==null && list2.length>0)){
			swap(list2, list1, n, i, 2);
		}

	}
	
	public int totalPrice(){
		return totalPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basket basket = new Basket();
		Item item1 = new Item("item1", 10);
		Item item2 = new Item("item2", 2);
		Item item3 = new Item("item3", 4);
		
		basket.add(item1, 5);
		basket.add(item2, 4);
		basket.add(item3, 3);

		System.out.println(basket.totalPrice());
	}

}
