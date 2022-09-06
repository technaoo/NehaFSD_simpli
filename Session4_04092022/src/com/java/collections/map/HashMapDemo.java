package com.java.collections.map;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,  "jack");
		map.put(6,  "john");
		map.put(3,  "bob");
		map.put(5,  "alex");
		
		System.out.println(map);
		System.out.println("Contains key 6? " +map.containsKey(6));
		System.out.println("Get value of 5 key " +map.get(5));
		System.out.println("Iterate using for each loop");
		
		for(Map.Entry<Integer, String> entry:map.entrySet())
			System.out.println(entry.getKey()+" " +entry.getValue());
		
		//Navigable Map<Integer, String> desc = map.descendingMap();
		
		System.out.println("Iterate using Iterate");
		Iterator<Map.Entry<Integer, String>> it  = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+ " " +entry.getValue());
			
		}
	}

}
