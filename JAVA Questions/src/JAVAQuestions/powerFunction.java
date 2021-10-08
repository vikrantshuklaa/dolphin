package JAVAQuestions;

public class powerFunction {

	public static void main(String[] args) {

		int base = 2;
		int exponent = 5;

		// System.out.println(Math.pow(base, exponent));

		long result = 1;

		while (exponent != 0) {
			result *= base;
			--exponent;
		}

		System.out.println(result);
	}

}
