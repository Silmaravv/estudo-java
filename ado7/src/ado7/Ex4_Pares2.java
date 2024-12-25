package ado7;

import java.util.Scanner;

public class Ex4_Pares2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe os números naturais que representa início e fim:");
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		
		int soma = 0;
		
		
		for ( int contador = n1 ; contador <= n2; contador++ ) {
			
			if (contador % 2 == 0) {
				soma = soma + contador;
			}
		
		} 
		
		System.out.println(soma);
	}

}
