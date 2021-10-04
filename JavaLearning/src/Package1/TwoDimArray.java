package Package1;

public class TwoDimArray {

	public static void main(String[] args) {

		int x[][] = new int[3][5];
		
		System.out.println(x.length); //length of row
		System.out.println(x[0].length); //length of column

		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		x[0][3] = 40;
		x[0][4] = 50;
		
		
		x[1][0] = 60;
		x[1][1] = 70;
		x[1][2] = 80;
		x[1][3] = 90;
		x[1][4] = 100;
		
		x[2][0] = 110;
		x[2][1] = 120;
		x[2][2] = 130;
		x[2][3] = 140;
		x[2][4] = 150;
		
		System.out.println(x[1][1]);
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++)
			{
				System.err.println(x[row][col]);
			}
	}
	}

}
