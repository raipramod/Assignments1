package homework1;

import java.util.Scanner;

public class DisplayTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
//		Declare three sides of triangle
		int a;
		int b;
		int c;
		System.out.println("Please Enter three sides of triangle");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a < b + c && b < a + c && c < a + b)
		{
			if (a == b && b == c)
				System.out.println("This is Equilateral Triangle");
			else if ( a == b || b == c || c == a )
				System.out.println("This is Iso triangle");
				else 
					System.out.println("This is Scalene trinagle");
		}
		else 
			System.out.println("ERROR, No Such Trinagle");
	}

}
