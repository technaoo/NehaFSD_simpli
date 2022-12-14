package com.simplilearn1.java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		
		int num1, num2;
		
		//Take user input for two numbersß
		Scanner var1 = new Scanner(System.in);	//Enter first number
		System.out.println("Enter first number: " +var1);
		num1 = var1.nextInt();
		
		Scanner var2 = new Scanner(System.in);	//Enter second number
		System.out.println("Enter second number: " +var2);
		num2 = var2.nextInt();
		
		Scanner sc= new Scanner(System.in);		//Enter operation type
		System.out.println("Select Operation: + - * /");
		String ch = sc.nextLine(); //nextLine() takes the string input
		System.out.println("Operation selected is " +ch);
		
		//Perform Arithmetic operation selected
		switch(ch) 
		{
		
			case "+":
				System.out.println("Addition result is: "+(num1+num2));
				break;
			case "-":
				System.out.println("Subtraction result is: "+(num1-num2));
				break;
			case "*":
				System.out.println("Multiplication result is: "+(num1*num2));
				break;
			case "/":
				System.out.println("Division result is: "+(num1/num2));
				break;
			default:		//For any other input than the four operations given
				System.out.println("\nUnrecognised input.\nPlease try again!");
				break;
		
		}
		
	}
}