package homework1;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "";
		String s2 = "";
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please Enter String");
		s1 = input.nextLine();
		int length = s1.length();
		
		for (int i = length-1; i >= 0; i-- )
			s2 = s2 + s1.charAt(i);
		
		if (s1.equals(s2))
	         System.out.println(s1 + " is a palindrome");
	      else
	         System.out.println(s1 + " is not a palindrome");
	}

}
