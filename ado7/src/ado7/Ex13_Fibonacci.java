package ado7;

import java.util.Scanner;

public class Ex13_Fibonacci {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe um número natural:");
		int n = ler.nextInt();
		
		int resultado = 1;
		if (n != 1 || n != 2) {
			int anterior = 1;
			for (int contador = 3; contador <= n; contador++) {
				int temp = resultado;
				resultado = resultado + anterior;
				anterior = temp;
			}
		}
		System.out.println(resultado);
	}

}
