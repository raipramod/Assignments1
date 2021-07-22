package homework1;

public class SwappingTwoNumWithTem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		System.out.println("Before Swapping Number:");
		System.out.println("First Number " + a);
		System.out.println("Second Number " + b);

//		Assigned first value using temporary variable
		int temporary = a;

		a = b;
		 b  = temporary;
		 
		 System.out.println("After Swapping Two Num Using Temp Variable");
		 System.out.println("a " +a);
		 System.out.println("b " +b);

	}

}
