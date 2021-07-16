package homework1;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c;
		double f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter temperature in F");
		f = input.nextDouble();
		c = (f -32)*(0.5556); //use the formula
		System.out.println("Please Enter the temperature in C");
		c = input.nextDouble();
		f = (c - 32) * 0.5556;
		
		System.out.println("F into C" +f);
		System.out.println("C into F" +c);
		
	}

}
