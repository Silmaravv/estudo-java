package ado7;

import java.util.Scanner;

public class Ex2_Fatorial {

	public static void main(String[] args) {
		/*Implemente um programa em Java que calcule o fatorial de um número
informado pelo usuário.
- O fatorial de um número é calculado pela multiplicação desse número por todos
os seus antecessores até chegar ao número 1.*/
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um número natural:");
		int n1 = ler.nextInt();
		
		int mult = 1;
		
		
		for ( int contador = 1 ; contador <= n1; contador++) {
			
			mult = mult * contador;
			
		} 
		
		System.out.println(mult);

	}

}
