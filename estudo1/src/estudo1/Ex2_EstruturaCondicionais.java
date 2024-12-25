package estudo1;

import java.util.Scanner;

public class Ex2_EstruturaCondicionais {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Informe os números:");
		
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		
		if ( numero1 > numero2) {
			System.out.println(numero1);
		}
		
		else { 
			System.out.println(numero2);
		}
		
		
		

	}

}
