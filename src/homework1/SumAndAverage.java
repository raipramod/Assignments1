/*Name: Pramod Rai
 * Class: Java
 * Instructor: Santosh Karna
 * Description: Write a program to find the sum and average of 
 * two numbers input by User (using Scanner class).
  */

package homework1;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		
//		Declare integers and double 
		int myFirstValue;
		int mySecondValue;
		int mySumValue;
		double myAverageValue ;
		
		Scanner input = new Scanner (System.in) ;
		System.out.println("Please, Enter my First Value");
		 myFirstValue  = input.nextInt();
		 System.out.println("Please, Enter my second value");
		 mySecondValue = input.nextInt();
		 
		 mySumValue = myFirstValue + mySecondValue;
		 myAverageValue = (myFirstValue + mySecondValue) / 2;
		 
		 System.out.println("The sum value of two numbers =" + mySumValue);
		 System.out.println("The Average value of two numbers =" + myAverageValue);
		 
	}

}
