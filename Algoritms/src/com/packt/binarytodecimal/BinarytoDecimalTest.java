package com.packt.binarytodecimal;

public class BinarytoDecimalTest {
	public static int convertToDecimal(String binary) {
		int conversion = 0;
		int result = 1;
		for(int i=0; i<=binary.length(); i++) {
			if(binary.charAt(binary.length() -1) =='1')
				result += conversion;
			conversion *= 2;
		} 
		return result;
		
	}

	public static void main(String[] args) {
		BinarytoDecimalTest binaryToDecimal = new BinarytoDecimalTest();
		String binary = "10110";
		System.out.println(BinarytoDecimalTest.convertToDecimal(binary));
		System.out.println("Result is: " +(BinarytoDecimalTest.convertToDecimal(binary)));
		
	}
}