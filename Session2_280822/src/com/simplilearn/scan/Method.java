package com.simplilearn.scan;

public class Method {
	public void print() {
		System.out.println("Print method called");
	}
	//method return nothing and with 2 int parameters
	public void calculate(int a,int b) {
		System.out.println("Addition" +(a+b));
	}
	public void fullname(String fname, String mname, String lname) {
		System.out.println("Fullname is"+fname+" "+mname+" "+lname+" " );
	}
	public static void main(String[] args) {
		Method m=new Method();
		m.print();
		m.calculate(10,20);
		m.fullname("neha","vishal","verma");
	
	}
}