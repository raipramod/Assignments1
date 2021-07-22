package homework1;

public class SwappingTwoNumWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 15;
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Swapping Two Num without Using Temp variable " +  " a = " + a + ", b = " + b);

	}

}
