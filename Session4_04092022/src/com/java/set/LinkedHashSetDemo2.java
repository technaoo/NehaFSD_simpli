package com.java.set;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		Set <String> set = new LinkedHashSet<>();
		set.add("jacr");
		set.add("tina");
		set.add("Jack");
		set.add("tim");
		
		
		System.out.println(set);
		set.remove("tina");
		System.out.println("After remove: " +set);
		//use iterator
		//print the size of ur set
		System.out.println("Size of set: " +set.size());
		
	}

}
