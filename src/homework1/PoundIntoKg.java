package homework1;

import java.util.Scanner;

public class PoundIntoKg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double oneKG = 0.454D;
		System.out.println("Please enter number in pounds");
		double pound = input.nextDouble();
		
		double kg = pound * oneKG;
		System.out.println("pound into KG " + kg);
		
		

	}

}
