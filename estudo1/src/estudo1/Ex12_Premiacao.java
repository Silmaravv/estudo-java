package estudo1;

import java.util.Scanner;

public class Ex12_Premiacao {

	public static void main(String[] args) {

		String nome, classif;
		int nota1, nota2, nota3, nota4, media, aulasDadas, presenca;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe as 4 notas de 0 a 100: ");
		nota1 = ler.nextInt();
		nota2 = ler.nextInt();
		nota3 = ler.nextInt();
		nota4 = ler.nextInt();
		System.out.println("Informe a quantidade de aulas dadas:");
		aulasDadas = ler.nextInt();
		System.out.println("Informe a quantidade de presença");
		presenca = ler.nextInt();
		

		if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100 || nota4 < 0
				|| nota4 > 100) {
			System.err.println("DADOS INVaLIDOS. Encerrando...");
			System.exit(0);

		}
		System.out.println("Informe o nome");

		ler.nextLine();
		nome = ler.nextLine();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media <= 20) {
			classif = "\u001B[31mPéssimo";
		} else if (media <= 40) {
			classif = "\u001B[31mRuim";
		} else if (media <= 60) {
			classif = "Regular";
		} else if (media <= 80) {
			classif = "Bom";
		} else {
			classif = "Ótimo";
		}
		
		double presencaPorcento = presenca / aulasDadas;
		if (media > 80 && presencaPorcento == 1) {	
			System.out.println("Excursão");
		}
		else if(media > 80 || presencaPorcento == 1) {
			System.out.println("Camiseta");
		}
		
		else if (media < 80 && media >70 && presencaPorcento >= 90) {
			System.out.println("Squeeze");	
		}
		else if ((media > 70 && media < 80) || presencaPorcento >= 90) {
			System.out.println("Caneta personalizada");
		}
		else {
			System.out.println("Nenhum premio");
		}
		System.out.printf("%s, suas notas foram:%n%3d%n%3d%n%3d%n%3d%nSua média %3d%nClassificação: %s", nome, nota1,
				nota2, nota3, nota4, media, classif);
		
		

	}

}
