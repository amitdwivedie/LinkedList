package com;

public class LinkedNode {
	
	private LinkedNode next;
	private Object object;
	
	public LinkedNode(Object object){
		this.object = object;
		next = null;
	}
	
	public LinkedNode(Object object, LinkedNode next){
		this.next = next;
		this.object = object;
	}

	public LinkedNode getNext() {
		return next;
	}

	public void setNext(LinkedNode next) {
		this.next = next;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	

}
