package iterations;

import java.util.Scanner;

public class drawAsterixTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Specify number of rows:");
		int numOfRows = sc.nextInt();
		
		/*Example:Let’s print a triangle made of asterisks (‘*’) separated by spaces. 
		The triangle should consist of n rows, where n is a given positive integer, 
		and consecutive rows should contain 1, 2, . . . ,n asterisks. For example, 
		for n= 4 the triangle should appear as follows:
		* 
		* * 
		* * * 
		* * * *
		*/
		for(int i=0; i <= numOfRows; i++) {
			for(int y = 0; y<i; y++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.print("\n\n");
		
		/* Let’s print a triangle made of asterisks (‘*’) separated by spaces and consisting of n rows again, 
		  but this time upside down, and make it symmetrical. 
		  Consecutive rows should contain 2n−1, 2n−3, . . . , 3, 1 asterisks 
		  and should be indented by 0, 2, 4, . . . ,2(n−1) spaces. 
		  For example, for n= 4 the triangle should appear as follows:
		  * * * * * * *
		    * * * * *
		      * * *
		        * 
		  */
		for(int row=numOfRows; row>0; row--) {
			for(int y=0; y<((numOfRows - row)*2); y++) {
				System.out.print(" ");
			}
			for(int z=0; z<(row*2-1);z++)
				System.out.print("* ");
			System.out.println();
		}
	}

}
