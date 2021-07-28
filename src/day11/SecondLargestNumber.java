package day11;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		  int array[] = {4, 10, 0, 6};
	      int size = array.length;
	      Arrays.sort(array);
	      int res = array[size-2];
	      System.out.println("Second Largest Number is :"+ res);	
	}
}
