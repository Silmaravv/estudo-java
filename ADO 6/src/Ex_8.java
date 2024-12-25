import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o numero da coluna");
		int tamanhoColuna = ler.nextInt();
		System.out.println("Informe o numero de linhas");
		int tamanhoLinha = ler.nextInt();
		
		int linha = 0;
			
		while(linha<tamanhoLinha) {
			
			int coluna =0;
			
			 while(coluna<tamanhoColuna) {
				 System.out.print("*");
				 coluna++;
			 }
			 System.out.println();
			 linha++;
		}
		
		
		
	}

}
