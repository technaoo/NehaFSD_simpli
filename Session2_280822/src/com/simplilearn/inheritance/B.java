package com.simplilearn.inheritance;

public class B extends A{
	public B()
	{
	super(10);
	System.out.println("Child class constructor");

}
	public static void main(String[] args)
	{
		B b = new B();
		b.print();
	}
}