package com.simplilearn.constructor;

public class Employee {
	private int id;
	private String name;
	private String email;
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public void printData()
	{
		System.out.println("ID:" +id);
		System.out.println("Name: " +name);
		System.out.println("Email: " +email);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Alex", "alex.c@gmail.com");
		Employee e2 = new Employee(2,"Tim", "Tim.c@gmail.com");
		Employee e3 = new Employee(3,"Joe", "Joe.c@gmail.com");
		e1.printData();
		e2.printData();
		e3.printData();
		
	}
}