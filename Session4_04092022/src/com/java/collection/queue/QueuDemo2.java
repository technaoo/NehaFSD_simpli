package com.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue= new LinkedList<>();
		 queue.add(10);
		 queue.add(20);
		 queue.add(30);
		 
		 //just give the first element of queue
		 System.out.println("Peek: " +queue.peek());
		 //it will give the first element and remove it as well
		 System.out.println("Poll: " +queue.poll());
		 System.out.println("Peek: " +queue.peek());
		 

	}

}
