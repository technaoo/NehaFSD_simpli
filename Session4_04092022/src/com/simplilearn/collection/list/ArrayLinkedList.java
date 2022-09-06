package com.simplilearn.collection.list;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedList {

	public static void main(String[] args) {
		
		List <Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		list.remove(3);
		
		System.out.println("After removal: " +list);
		System.out.println("List size: " +list.size());
		System.out.println("Check if it contains 20 " +list.contains(20));
		
		for(int num:list)
		{
			System.out.println(num);
		}
		
		//to print data using Iterator interface 
		System.out.println("Use of Iterator");
		Iterator<Integer> it = list.iterator();

		while(it.hasNext()) {
	
			System.out.println(it.next());
	
		
		}
	}

}
