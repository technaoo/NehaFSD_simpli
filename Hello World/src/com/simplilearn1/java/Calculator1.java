package com.simplilearn1.java;
import java.util.Scanner;
public class Calculator1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	//Enter first number
		
		while(true) {
			System.out.println("ENter any two numbers: ");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		
		System.out.println("ENter any operator: ");
		String operator = sc.next();
		char c = operator.charAt(0);
		if(c++ == '+')
			System.out.println("Addition: " +(var1+var2));
		else if(c++ == '-')
			System.out.println("Subtraction: "  +(var1-var2));
		else
			System.out.println("Invalid operation: ");
		}
		//else if
	}
}
