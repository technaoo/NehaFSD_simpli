import java.util.Scanner;

public class DisplayingContent {
	public static void main(String[] args){
	//Factorial program
		//3! = 3*2*1 = 6
		//variable declaration
	int n;
	int fact_var = 1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number?");
	//take user input
	n = sc.nextInt();
	//calculating factorial
	for(int i = 1; i <=n; i++)
	{
		fact_var = fact_var*i;
	}
	//print output
	
	System.out.println("Factorial of the number =" +fact_var);
	
	}

}