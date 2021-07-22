package homework1;

// Checking a Leap year

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
//		Declare integer
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter any Year:");
		year = input.nextInt();
		input.close();
		boolean isLeapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					isLeapYear = true;
				else
					isLeapYear = false;
			} else
				isLeapYear = true;
		} else {
			isLeapYear = false;
		}

		if (isLeapYear == true)
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year + " is not a Leap Year.");
	}

}
