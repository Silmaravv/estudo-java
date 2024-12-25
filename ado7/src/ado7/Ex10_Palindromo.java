package ado7;

import java.util.Scanner;

public class Ex10_Palindromo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
				
		System.out.println("Informe a frase:");
		String texto = ler.nextLine();
		boolean palindromo = true;
		
		  int inicio = 0;
	        int fim = texto.length() - 1;
	        
	        while (inicio < fim) {
	            if (texto.charAt(inicio) != texto.charAt(fim)) {
	                palindromo = false;
	            }
	            inicio++;
	            fim--;
	        }
		
	        if (palindromo) {
	        	System.out.println("é palíndromo");
	        	
	        	
	        }
	        
	        else {
	        	System.out.println("Não é palíndromo");
	        }
	        

	}

}
