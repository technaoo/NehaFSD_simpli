package com.java.set;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet <String> set = new TreeSet<>();
		set.add("jacr");
		set.add("tina");
		set.add("Jack");
		set.add("tim");
		
		
		System.out.println(set);
		set.remove("tina");
		System.out.println("After remove: " +set);
		//use iterator method
		Iterator<String> it = set.iterator();
		System.out.println("With Iterator ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//print the size of your set
		System.out.println("Size of Set: " +set.size());
		
		//print the set in descending order
		SortedSet <String> desc = ((TreeSet<String>) set).descendingSet();
		System.out.println(desc);
		
	}

}
