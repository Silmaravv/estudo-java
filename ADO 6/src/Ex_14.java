import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
		
		 int [] numeros = new int[] {3,5,9};
		    int primeiro = numeros[0];
		    int ultimo = numeros[numeros.length-1];
		    int meio = numeros [numeros.length/2];
		    
		    if (primeiro > ultimo && primeiro > meio) {
		    	System.out.println(primeiro);
			}
		    
		    else if (ultimo > primeiro && ultimo > meio) {
				System.out.println(ultimo);
				
		    }
		    
		    else {System.out.println(meio);}
		
	}

}
