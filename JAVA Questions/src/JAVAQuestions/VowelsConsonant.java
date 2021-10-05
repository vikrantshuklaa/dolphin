package JAVAQuestions;

public class VowelsConsonant {

	public static void main(String[] args) {

		char ch = 'a';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("This alphabet is a vowel");
		else
			System.out.println("This alphabet is a consonant");

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

			System.out.println("still a vowel");

			break;

		default:
			System.out.println("oh no, its a consonant");
			break;
		}
	}

}
