package day11;

// Write a Program to accept 5 values in an array and display their sum.


public class SumOfFiveArrays {
	public static void main(String[] args) {
		int [] arr = {3, 5, 7, 9, 11};
		int sum = 0;
		
//		use for loop
		for ( int i: arr) {
			sum = sum + i;
		}
		
		System.out.println("Sum of 5 numbers is: " +sum);
	}
}
