package homework1;

import java.util.Scanner;

public class CheckingEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int CheckNum;
		
		System.out.println("Please Enter Number");
		
		Scanner input = new Scanner(System.in);
		CheckNum = input.nextInt();
	
		if (CheckNum % 2 == 0 )
			System.out.println("Number is Even");
		else 
			System.out.println("Number is Odd");
		
	}

}
