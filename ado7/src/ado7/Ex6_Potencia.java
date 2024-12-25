package ado7;

import java.util.Scanner;

public class Ex6_Potencia {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe os números naturais que representa início e fim:");
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		
		int mult = 1;
		
		
		for ( int contador = 1 ; contador <= n2; contador++ ) {
				mult = mult * n1;
		} 
		
		System.out.println(mult);
	}

}
