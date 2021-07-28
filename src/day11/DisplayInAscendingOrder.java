package day11;

public class DisplayInAscendingOrder {
	
	public static void main(String[] args) {          
        int [] arr = new int [] {4, 7, 3, 0};     
        int temp = 0;    
            
        System.out.println("Numbers Before Ascending: ");    
        for (int i = 0; i < arr.length; i++) {   
        	
            System.out.print(arr[i] + " ");    
        }       
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
           System.out.println();    
        System.out.println("Numbers After Ascending: ");    
        for (int i = 0; i < arr.length; i++) { 
        	
            System.out.print(arr[i] + " ");    
        }    
    }    
}