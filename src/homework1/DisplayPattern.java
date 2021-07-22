package homework1;

public class DisplayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Display Pattern");
//		use for loop
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print(k);
				System.out.println();
		}
	}
}
