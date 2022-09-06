package com.simplilearn.regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;


public class Assignment2_040922 {
	public static void main(String[] args) {
		
		String userid;
		List <String> list = new ArrayList<>();
		
		list.add("abc@gmail.com");
		list.add("def@gmail.com");
		list.add("ghi@gmail.com");
		list.add("jkl@gmail.com");
		list.add("mno@gmail.com"); 
		list.add("pqr@gmail.com"); 
		list.add("stu@gmail.com"); 
		list.add("vwx@gmail.com"); 
		list.add("yza@gmail.com"); 
		list.add("bcd@gmail.com"); 
		
	//Ask user to enter his input his email id
		System.out.print("Enter a valid email id to search: ");
		Scanner sc = new Scanner(System.in);
		userid = sc.next();
		
		System.out.println();	//print result in next line
		
		//check whether the entered user id is valid or not
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z.]+$");
		Matcher matcher = pattern.matcher(userid);
		if(matcher.matches())
		{
			System.out.print("Entered user ID is valid");
			for(int i =0; i<list.size(); i++)
			{
		 
				if(userid.matches(list.get(i))) 
				{
					 System.out.println(" - User ID is matched");
					 break;
				}
				
				else 
				{
					System.out.println(" - Sorry, User doesn't exist!");
					break;
				}
			}
		}
		else 
			System.out.println("Entered user ID is invalid!!!");
		sc.close();
	}

}
