package ado7;

import java.util.Scanner;

/*Implemente um programa em Java que separe os caracteres de um texto
com um hífen (-). O usuário deve informar uma mensagem e o programa
deve apresentar a mensagem separando seus caracteres por hífen,
seguindo as regras:
* Espaços devem ser desconsiderados.
* O último caractere não deve ter hífen.
* Todos caracteres devem estar em maiúsculo.*/

public class Ex8_BoraCodar {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe a frase:");
		String texto = ler.nextLine().toUpperCase();
		String resultado = "";
		
		for ( int contador = 0 ; contador < texto.length(); contador++ ) {
			char letra = texto.charAt(contador);
			if (letra != ' ') {
				resultado = resultado + letra; 
				if (contador != texto.length()-1) {
					resultado = resultado + "-";
				}
			}
		
		} 
		
		System.out.println(resultado);

	}

}
