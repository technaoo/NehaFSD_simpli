package com.simplilearn.scan;

public class Method1 {
	public String greetings() {
		return "Good Morning";
	}
	//method return nothing and with 2 int parameters
	public int add(int a,int b) {
		return a+b;
	}
	public float cube(float n) {
		return n*n*n;
	}
	public static void main(String[] args) {
		Method1 m=new Method1();
		String res = m.greetings();
		System.out.println("Result is " +res);
		System.out.println("Addition is " +m.add(10,20));
		System.out.println("Cube is " +m.cube(4.0f));
		
	
	}
}
