package estudo1;

import java.util.Scanner;

public class Ex11_MediaAluno {

	public static void main(String[] args) {
		/*   calcular uma nova média entre a média
inicial e a nota de recuperação e caso esta nova média seja abaixo de 6
informar que o aluno está reprovado, caso contrário, informar que o aluno
está aprovado por recuperação. */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as 3 notas:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		double media = (n1 + n2 + n3)/3;
		if (media >= 6.0) {
			System.out.println("Aprovado");		
		}
		else if (media < 5.0) {
			System.out.println("Reprovado");		
		}
		
		else if (media >= 5.0 && media < 6.0) {
			System.out.println("Recuperação");
			System.out.println("informe a nova nota");
			double n4 = scan.nextDouble();
			media = (n1 + n2 + n3 + n4)/4;
			
			if (media < 6.0) {
				System.out.println("Reprovado");
			}
			
			else {
				System.out.println("Aprovado");
			}
		}
		
	}

}
