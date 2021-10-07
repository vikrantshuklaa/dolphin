package JAVAQuestions;

public class largestNumber {

	public static void main(String[] args) {

		int x = 1100;
		int y = 200;
		int z = 300;

		if (x > z && x > y) {
			System.out.println("X is the highest");
		} else if (y > z) {
			System.out.println("Y is the highest");
		} else {
			System.out.println("Z is the highest");
		}
	}

}
