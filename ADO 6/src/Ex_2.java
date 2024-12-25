import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		/* Implemente um programa em Java que escreva no terminal
		os números naturais de forma regressiva de um número informado até 1.*/
		System.out.println("informe um numero");
		Scanner ler = new Scanner(System.in);
		int numero = ler.nextInt();
		int contador =numero;
		while(contador >= 1) { 
			System.out.println(contador);
			contador --;
			}

	}

}
