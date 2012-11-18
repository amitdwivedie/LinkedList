package com;

public class LinkedListTest {
   
	private LinkedNode firstNode;
	private int size;
	
	public LinkedListTest(){
		firstNode = new LinkedNode(null);
		size = 0;
	}
	
	public void add(Object object){
		LinkedNode node = new LinkedNode(object);
		LinkedNode current = firstNode;
		
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(node);
		size++;
	}
	
	public void add(int pos, Object object){
		LinkedNode node = new LinkedNode(object);
		LinkedNode current = firstNode;
		
		for(int i = 0; (i < pos) && (current.getNext() != null); i++)
		{
			current = current.getNext();
		}
		
		node.setNext(current.getNext());
		current.setNext(node);
		size++;
		
	}
	
	public Object get(int index){
		if(index < 0)
			return null;
		
		LinkedNode current = firstNode.getNext();
		for(int i = 0; i < index; i++)
		{
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getObject();
	}
	
	public boolean remove(int index){
		if(index < 0 || index > size())
			return false;
		
		LinkedNode current = firstNode;
		for(int i = 0; i < index; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		size--;
		return true;
	}
	
	public int size(){
		return size;
	}
	
	public String toString()
	{
		LinkedNode current = firstNode.getNext();
		String output = "{";
		while(current != null)
		{
			output += "[" + current.getObject().toString() + "]";
			current = current.getNext();
		}
		output += "}";
		return output;
	}
}

