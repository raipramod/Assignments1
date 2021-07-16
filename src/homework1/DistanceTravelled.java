package homework1;

/*Write a Program for the following Mathematical Function.in  java
s = ut + 1/2at^2 in java
*/

public class DistanceTravelled {

	static double testcase1 = 12.5;

	static double testcase2 = 4.4;

	static double testcase3 = 10;

	public static void main(String args[]) {
		DistanceTravelled testInstance = new DistanceTravelled();
		double result = testInstance.distance(testcase1, testcase2, testcase3);
		System.out.println(result);
	}

	public double distance(double u, double a, double t) {
		double d = d = u * t + 1 / 2 * a * t * t;
		return d;
	}
}
