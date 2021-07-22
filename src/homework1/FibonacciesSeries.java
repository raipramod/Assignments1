package homework1;

public class FibonacciesSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declare integers
		int totalNum = 6; 
		int n1 = 1; 
		int n2 = 1;
        System.out.print("Fibonaccies Series ");
//        use for loop
        for (int i = 1; i <= totalNum; ++ i)
        {
            System.out.print(n1+" ");
            int SumOfTwo = n1 + n2;
            n1 = n2;
            n2 = SumOfTwo;
        }
	}
}
