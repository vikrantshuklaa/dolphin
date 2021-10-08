package JAVAQuestions;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the two numbers: ");
		
		double First  = reader.nextDouble();
		double Second = reader.nextDouble();
		
		double result = 0;
		
		System.out.println("Please enter the operator to be used: (+, -, *, %) ");
		
		char operator = reader.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = First + Second;
			break;
			
		case '-':
			result = First - Second;
			break;
			
		case '*':
				result = First * Second;
				break;
				
		case '%':
					result = First % Second;
					break;
		default:
			System.out.println("Please pass the correct operator");
			break;
		}
		
		System.out.println(result);
		
		
	}

}
