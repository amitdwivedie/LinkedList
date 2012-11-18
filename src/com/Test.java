package com;

public class Test {
	
	public static void main(String g[]){
		LinkedListTest link = new LinkedListTest();
		link.add("hello");
		link.add(1);
		link.add(2);
		link.add(3);
		link.add("amit");
		link.remove(2);
		System.out.println(link);
		System.out.println(link.get(2));
		System.out.println(link.remove(2));
		System.out.println(link);
		System.out.println(link.get(0));
		link.add(1,"pos");
		System.out.println(link);
	}

}
