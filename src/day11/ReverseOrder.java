package day11;

public class ReverseOrder {
	public static void main(String[] args) {
	
		int [] array = new int [] {10, 20, 25, 40};  
		
        System.out.println("Order Before Reverse: ");  
        
        	for (int i = 0; i < array.length; i++) {  
        		System.out.print(array[i] + " ");  
        }  
        
        System.out.println();  
        System.out.println("Order After Reverse: ");    
        	for (int i = array.length-1; i >= 0; i--) {  
        		System.out.print(array[i] + " ");  
        }  
		
	}
}
