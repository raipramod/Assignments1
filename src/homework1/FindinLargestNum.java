package homework1;

public class FindinLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Declare and Initialize integers
		int myFirstNum = 5;
		int mySecondNum = 3;
		int myThirdNum = 9;

		if (myFirstNum >= mySecondNum && myFirstNum >= myThirdNum)
			System.out.println(myFirstNum + "is my largest num");
		else if (mySecondNum >= myFirstNum && mySecondNum >= myThirdNum)
			System.out.println(mySecondNum + "is my largest Num");
		else
			System.out.println(myThirdNum + " is my Largest Num");

	}

}
