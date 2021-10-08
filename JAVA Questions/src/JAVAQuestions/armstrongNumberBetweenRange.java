package JAVAQuestions;

public class armstrongNumberBetweenRange {
	public static void main(String[] args) {
		int num;
		int base;
		double sum = 0;
		System.out.print("Armstrong numbers from 1 to 1000:");
		for (int i = 1; i <= 1000; i++) {
			num = i;
			while (num > 0) {
				base = num % 10;
				sum = sum + Math.pow(base, 3);
				num = num / 10;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}
}