package ado7;

import java.util.Scanner;

/*Implemente um programa em Java que calcule a soma dos números
naturais múltiplos de um número informado pelo usuário, a partir de um
número de início e fim, também informados pelo usuário.
*Um número (A) é múltiplo de outro (B) quando em sua divisão (A / B) o resto é zero.*/

public class Ex5_mult {

	public static void main(String[] args) {
		
		
Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o primeiro nº multiplo o segundo inicio e o terceiro fim:");
		int mult = ler.nextInt();
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		
		
		int soma = 0;
		
		
		for ( int contador = n1 ; contador <= n2; contador++ ) {
			
			if (contador % mult == 0) {
				soma = soma + contador;
			}
		}
		System.out.println(soma);
	}
	

}
