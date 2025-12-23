package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test5.Basket;
import com.test5.Item;

public class BasketTest {

	@Test
	public void test() {
		
		Basket basket = new Basket();
		Item item1 = new Item("item1", 10);
		Item item2 = new Item("item2", 2);
		Item item3 = new Item("item3", 4);
		
		basket.add(item1, 5);
		basket.add(item2, 4);
		basket.add(item3, 3);

		assertEquals(70, basket.totalPrice());
	}

}
