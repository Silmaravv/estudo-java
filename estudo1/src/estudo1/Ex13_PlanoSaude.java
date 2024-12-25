package estudo1;

import java.util.Scanner;

public class Ex13_PlanoSaude {

	public static void main(String[] args) {
		/*Crie um algoritmo em que o usuário digite seu plano de saúde, e seja exibido
o valor da sua respectiva mensalidade, de acordo com a tabela abaixo. Caso
seja informado um plano inválido, avise o usuário.*/
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o seu plano de saúde (basico,bronze,prata ou ouro):");
		String plano = ler.nextLine();
		
		if (plano.equals("basico")) { 
			System.out.println("O valor é de R$150,00");
		}
		else if (plano.equals("bronze")) { 
			System.out.println("O valor é de R$220,00");
		}
		
		else if (plano.equals("prata")) {
			System.out.println("R$310,00");
		}
		
		else if (plano.equals("ouro")) {
			System.out.println("R$450,00");
		}	
		else { 
			System.out.println("Plano inválido");
		}
	
	}

}
