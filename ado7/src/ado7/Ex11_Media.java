package ado7;

import java.util.Scanner;

public class Ex11_Media {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        double nota1, nota2, nota3;

	        while (true) {
	            System.out.print("Informe a primeira nota (0 a 10): ");
	            nota1 = scanner.nextDouble();
	            if (nota1 >= 0 && nota1 <= 10) {
	                break;
	            } else {
	                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
	            }
	        }


	        while (true) {
	            System.out.print("Informe a segunda nota (0 a 10): ");
	            nota2 = scanner.nextDouble();
	            if (nota2 >= 0 && nota2 <= 10) {
	                break;
	            } else {
	                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
	            }
	        }

	        while (true) {
	            System.out.print("Informe a terceira nota (0 a 10): ");
	            nota3 = scanner.nextDouble();
	            if (nota3 >= 0 && nota3 <= 10) {
	                break;
	            } else {
	                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
	            }
	        }

	        double media = (nota1 + nota2 + nota3) / 3;
	        
	        System.out.printf("A média das três notas é: %.2f%n", media);
				
	

	}

}
