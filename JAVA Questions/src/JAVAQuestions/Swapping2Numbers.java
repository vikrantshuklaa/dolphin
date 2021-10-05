package JAVAQuestions;

public class Swapping2Numbers {

	public static void main(String[] args) {
// Using Temp Variable

		int a = 20;
		int b = 10;

		System.out.println("Before Swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		int Temp;
		Temp = a;
		a = b;
		b = Temp;

		System.out.println("After Swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

//Without using Temp Variable
		
		System.out.println("Before Swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("After Swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
