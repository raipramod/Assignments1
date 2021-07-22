package homework1;

import java.util.Scanner;

public class DisplaySevenDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Numbers from 1 to 7");
		day = input.nextInt();
		System.out.println(getDayName(day));
		
	}

	public static String getDayName(int day) {
		String dayName = " ";
		switch(day) {
		case 1 : dayName = "Sunday";
		break;
		case 2 : dayName = "Monday";
		break;
		case 3 : dayName = "Tuesday";
		break;
		case 4 : dayName = "Wednesday";
		break;
		case 5 : dayName = "Thursday";
		break;
		case 6 : dayName = "Friday";
		break;
		case 7 : dayName = "Saturday";
		break;
		default: dayName ="ERROR";
		}
		return dayName;
	}

}
