package estudo1;

import java.util.Scanner;

public class Ex3_NomeAluno {

	public static void main(String[] args) {

		String nome, classif;
		int nota1, nota2, nota3, nota4, media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe as notas");
		nota1 = ler.nextInt();
		nota2 = ler.nextInt();
		nota3 = ler.nextInt();
		nota4 = ler.nextInt();

		if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100 || nota4 < 0
				|| nota4 > 100) {
			System.err.println("DADOS INVÃLIDOS. Encerrando...");
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
		System.out.printf("%s, suas notas foram:%n%3d%n%3d%n%3d%n%3d%nSua média %3d%nClassificação: %s", nome, nota1,
				nota2, nota3, nota4, media, classif);

	}

}
