package ado7;

import java.util.Scanner;

public class Ex3_Pares {
	
	/*Implemente um programa em Java que calcule a soma dos números
naturais pares de 1 até um número informado pelo usuário.*/

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe um número natural:");
		int n1 = ler.nextInt();
		
		int soma = 0;
		
		
		for ( int contador = 1 ; contador <= n1; contador++ ) {
			
			if (contador % 2 == 0) {
				soma = soma + contador;
			}
		
		} 
		
		System.out.println(soma);
		

	}

}
