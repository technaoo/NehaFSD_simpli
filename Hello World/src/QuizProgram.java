
import java.util.Scanner;

public class QuizProgram {
	public static void main(String[] args){
		
		int n;
		//created Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Who is the Founder of Microsoft?");
		System.out.println("1.Bill Gates\n 2. Jeff Bezos\n 3. Satyam Nadela\n 4. Tim Cook\n");
	while(true)
	{
		//Read input from user
		System.out.println("Enter your choice from 1-4 :");
		n = sc.nextInt();
		//Validate user input
		if (n == 1)
		{
			System.out.println("Congratulations. Your answer is correct.");
			break;
		}
		else
			System.out.println("Wrong input. Please try again...");
	}
		
		
	}
}
