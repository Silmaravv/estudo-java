package estudo1;

import java.util.Scanner;

public class Ex4_ValorEntre {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Informe os 3 numeros:");
		 num1 = ler.nextDouble();
		 num2 = ler.nextDouble();
		 num3 = ler.nextDouble();
		 
		 if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)) {
			 
			 System.out.println(" O número " + num3 + " está entre os dois primeiro");
			
		 }
		 
		 
		 else {
			 System.out.println("o número não está entre os dois primeiros");
		 }
		 
		 ler.close();
	}

}
