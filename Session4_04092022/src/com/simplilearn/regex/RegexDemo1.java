package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo1 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		String input = sc.next();
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches())
			System.out.println("Pattern matches");
		else 
			System.out.println("Not matched");
		
		sc.close();
		
	}

}
