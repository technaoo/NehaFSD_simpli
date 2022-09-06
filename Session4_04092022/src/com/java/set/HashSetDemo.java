package com.java.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet <String> set = new HashSet<>();
		set.add("jack");
		set.add("tina");
		set.add("Jia");
		set.add("tim");
		
		
		System.out.println(set);
		set.remove("tina");
		System.out.println("After remove: " +set);
		//use iterator
		//print the size of ur set
		
	}

}
