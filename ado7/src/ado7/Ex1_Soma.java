package ado7;

import java.util.Scanner;

public class Ex1_Soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	
		System.out.println("Informe um número natural:");
		int n1 = ler.nextInt();
		
		int soma = 0;
		
		
		for ( int contador = 1 ; contador <= n1; contador++) {
			
			soma = soma + contador;
			
		} 
		
		System.out.println(soma);
		
			
			
		

	}

}
