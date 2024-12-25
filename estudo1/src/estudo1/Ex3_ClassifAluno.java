package estudo1;

import java.util.Scanner;

public class Ex3_ClassifAluno {

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
			// return;
		}
		System.out.println("Informe o nome");
		// "consome" o Enter do comando anterior
		ler.nextLine();
		nome = ler.nextLine();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media <= 20) {
			classif = "\u001B[31mPÃ©ssimo";
		} if (media <= 20) {
			classif = "\u001B[31mPÃ©ssimo";
		} else if (media <= 60) {
			classif = "\u001B[33mRegular";
		} else if (media <= 80) {
			classif = "\u001B[34mBom";
		} else {
			classif = "\u001B[32mÃ“timo";
		}
		System.out.printf("%s, suas notas foram:%n%3d%n%3d%n%3d%n%3d%nSua mÃ©dia Ã© %3d%nClassificaÃ§Ã£o: %s", nome, nota1,
				nota2, nota3, nota4, media, classif);

	}

}
