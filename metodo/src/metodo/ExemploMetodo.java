package metodo;

import java.util.Scanner;

public class ExemploMetodo {
	
	/*Crie um método que verifique
	 *  se uma  pessoa é maior de idade ou não.*/

	public static void main(String[] args) {

		Scanner ler =  new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int valor1, valor2;
		valor1 =  ler.nextInt();
		valor2 = ler.nextInt();
		
	}
	
	 /*public boolean verificarIdade(int valor1) {
		 if (valor1 >= 18) {
	         return true;
	     }
		 else { 
			 return false; 
		 }
	 }*/
	
	 
	 public boolean verificarIdade2(int valor1) {
		 return valor1 >= 18;
		 
	 }
	 

}
