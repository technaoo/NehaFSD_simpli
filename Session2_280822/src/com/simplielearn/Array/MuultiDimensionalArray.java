package com.simplielearn.Array;

public class MuultiDimensionalArray {
	public static void main(String[] args) {
		
	
		int array[][]= {{1,2,3},{2,3,4}};
		System.out.println("Direct Access: " +array[1][2]);
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++){
			{
				System.out.print(array[row][col]+"\t");
			}
				System.out.println("print using for");
			}
			System.out.println("print using for each");
		}
			for(int a[]:array) {
				for(int x:a)
					System.out.print(x+"\t");
					System.out.println();
			
		}
	}
}

