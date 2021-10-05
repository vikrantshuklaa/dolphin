package JAVAQuestions;

import java.util.Scanner;

public class printInteger {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number:");

		int num = reader.nextInt();

		System.out.println("Number you entered is: " + num);

	}

}