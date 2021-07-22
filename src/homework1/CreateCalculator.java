package homework1;

import java.util.Scanner;

public class CreateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter first Num");
		a = input.nextInt();
		System.out.println("Please Enter Second Num");
		b = input.nextInt();
		System.out.println("Please Enter an Operator such as + , - , * , /");
		char operator = input.next().charAt(0);
		
		input.close();
		int output;
		switch(operator)
		{
		case '+' :
			output = a + b;
			break;
		case '-' :
			output = a - b;
			break;
		case '*' :
			output = a * b;
			break;
		case '/' :
			output = a / b;
			break;
			default:
				System.out.println("ERROR");
				return;
		}
		System.out.println("Calculate " + a + " " + operator + " " + b + " " + "Total Function is " + output);
	}

}
