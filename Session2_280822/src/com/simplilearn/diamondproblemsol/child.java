package com.simplilearn.diamondproblemsol;

public class child implements A,B{

	public void print() {
		System.out.println("Print method called");
		
	}
	
	public static void main(String[] args)
	{
		child c = new child();
		
				c.print();
				
				A a = new child();
				B b = new child();
				a.print();
				b.print();
		
	}
}
