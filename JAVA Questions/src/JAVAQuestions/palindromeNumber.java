package JAVAQuestions;

public class palindromeNumber {

	public static void main(String[] args) {

		int num = 131;
		int rev = 0;

		int actualnum = num;

		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;

		}

		System.out.println(rev);

		if (actualnum == rev) {
			System.out.println(actualnum + " is a palindrome number");
		} else {
			System.out.println(actualnum + " is not a palindrome number");
		}
	}

}
