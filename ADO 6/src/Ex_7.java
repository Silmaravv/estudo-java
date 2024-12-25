import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o tamanho do quadrado*");
		int tamanho = ler.nextInt();
		
		int linha = 0;
		
		while (linha < tamanho) {
			int coluna = 0;
			
			while (coluna < tamanho) {
				System.out.print("*");
				coluna++;
			}
			
			System.out.println();
			linha++;
		}
		
	}

}
