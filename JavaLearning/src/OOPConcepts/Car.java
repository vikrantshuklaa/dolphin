package OOPConcepts;

public class Car {
// Create Global variables or Class variables
	
	int model;
	int wheel;
	
	public static void main(String[] args) {
		
		//new Car(); this is the object of car class
		//new keyword is used to create an object
		//a,b,c are object reference variables

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		
		a.model = 2013;
		a.wheel = 4;
		
		b.model = 2014;
		b.wheel = 4;
		
		c.model = 2015;
		c.wheel = 4;
		//Before rearranging the references
		{
			System.out.println(a.model);
			System.out.println(b.model);
			System.out.println(c.model);

		}
		
		a=b;
		b=c;
		c=a;
		//After rearranging the references
		{
			System.out.println(a.model);
			System.out.println(b.model);
			System.out.println(c.model);

		}
		
	}

}
