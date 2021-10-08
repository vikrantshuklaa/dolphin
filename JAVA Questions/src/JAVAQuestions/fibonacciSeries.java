package JAVAQuestions;

public class fibonacciSeries {

	public static void main(String[] args) {

		int num = 10;
		int t1 = 0;
		int t2 = 1;
		
		// 0,1,1,2,3,5,8,13....

		for (int i = 1; i <= num; i++) {
			int sum = t1 + t2;
			System.out.println(t1);

			t1 = t2;
			t2 = sum;

		}

	}

}
