package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinkedListTest {

	@Test
	public void testAdd() {
		LinkedNode node = new LinkedNode("hello");
		LinkedNode current = new LinkedNode(null);
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(node);
		
		LinkedListTest test = new LinkedListTest();
		test.add("hello");
		
		assertEquals(test.get(0), node.getObject().toString());
	}
	
	@Test
	public void testRemove(){
		
	}
	
	@Test
	public void testGet(){
		LinkedNode node = new LinkedNode("hello");
				
		LinkedListTest link = new LinkedListTest();
		link.add("hello");
		Object obj = link.get(0);
		
		assertTrue(obj == node.getObject());
				
	}
	
	@Test(expected= NullPointerException.class) 
	public void testGetWithoutAnySave(){
		LinkedListTest link = new LinkedListTest();
		LinkedNode node = new LinkedNode("hello");
		
		assertEquals(link.get(0), node.getObject());
		
		
		
	}

}
