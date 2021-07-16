package homework1;

import java.util.Scanner;

public class NegativeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num ;
		Scanner input = new Scanner(System.in);
		System.out.println("Pleae Enter the Num what you want to check");
		Num = input.nextInt();
		input.close();
		if (Num > 0)
		{
			System.out.println(Num + " is positive num");
		}
		else if (Num < 0 )
		{
			System.out.println(Num + " is negative num");
		}
		else
		{
			System.out.println(Num + "Neither Postive or Negative");
		}

	}

}
