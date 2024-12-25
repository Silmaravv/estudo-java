package ado7;

import java.util.Scanner;

public class Ex7_BoraCodar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
				
		System.out.println("Informe a frase:");
		String texto = ler.nextLine();
		String resultado = "";
		
		for ( int contador = 0 ; contador < texto.length(); contador++ ) {
			char letra = texto.charAt(contador);
			resultado = resultado + letra + "-"; 
		} 
		
		System.out.println(resultado);

	}

}
