package JAVAQuestions;

public class factorsOfANumber {

	public static void main(String[] args) {

		int num = 120;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
