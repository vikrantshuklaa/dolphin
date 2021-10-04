package Package1;

public class ArrayConcepts {

	public static void main(String[] args) {
		int j =10;
		System.out.println(j);
		
		/*dis-advantages of array
		1. size is fixed -- static array  -- To overcome this problem,
		we use Collection -- ArrayList and HashTables -- Use dynamic array
		2. stores only  similar data types -- To overcome this problem, 
		we use Object array
		
		
		*/
		
		int i[] = new int[4]; //int array
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		{
		System.out.println(i[3]); //Print specific index value
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		System.out.println(i.length); //Prints the length or size of array
		}
		
		double d[] = new double[3]; //double array
		d[0] = 12.12;
		d[1] = 13.13;
		d[2] = 14.14;
		{
			System.out.println(d[2]);
			System.out.println(d.length);
		}
		
		char c[] = new char[3]; //char array
		c[0] = 'P';
		c[1] = 1;
		c[2] = '&';
		{
			System.out.println(c[2]);
			//System.out.println(c[3]); //Index out of bound exception

		}
		
		boolean b[] = new boolean[2]; //boolean array
		b[0] = true;
		b[1] = false;
		
		{
			System.out.println(b[0]);
		}
		
		String s[] = new String [3];
		s[0] = "This is my String";
		s[1] = "Hello World";
		{
			System.out.println(s.length); //String Length
			System.out.println(s[2]); //String is null
		}
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.22;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = true;
		
		{
			System.out.println(ob[3]);
		}

		
		
		
		
		
		
		
		
		
	}

}
