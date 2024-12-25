import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// Implemente um programa em Java que escreva no terminal os números naturais de 1 até um número informado.

		System.out.println("Informe o número que deseja contar");
		Scanner ler = new Scanner(System.in);
		int numero =ler.nextInt();
		
		
		int contador = 1;
		
		while(contador <=numero) {
			System.out.println(contador); contador++;}
	}

}
