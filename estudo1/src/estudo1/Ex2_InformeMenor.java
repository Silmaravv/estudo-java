package estudo1;

import java.util.Scanner;

public class Ex2_InformeMenor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe os 3 número:");
		
		int num1,num2,num3;
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		int menor = num1; 
		
		if ( num2 < menor ) {
			System.out.println(num2);
		}
		
		if (num3 < menor) {
			System.out.println(num3);
			
		}
	}

}
