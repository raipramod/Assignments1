package homework1;

import java.util.Scanner;

public class AreaVolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double pi = 3.14D;
		System.out.println("Please Enter radius of cylinder ");
		double r = input.nextDouble();
		System.out.println("Please Enter length of cylinder ");
		double l = input.nextDouble();
		
//		Use the formula to calculate the are and vloume of cylinder 
		double area = pi * r * l;
		double volume = area * l;
		System.out.println("Area of Cylinder " + area);
		System.out.println("Volume of Cylinder " + volume);
	}

}
