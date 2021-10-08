package JAVAQuestions;

public class displayPrimeNumberBetwn2NumbersRange {

	public static void main(String[] args) {

		int low = 20;
		int high = 90;

		while (low < high) {

			boolean flag = false;

			for (int i = 2; i <= low / 2; i++) {

				if (low % i == 0) {
					flag = true;
				}

			}

			if (!flag) {
				System.out.print(low + " ");
			}

			low++;

		}
	}

}
