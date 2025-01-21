package obi;

import java.util.Scanner;

public class Camisetas_da_olimpiada {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o número de premiados:");
		int numeroPremiados = ler.nextInt();
		
		int []tamanhoSolicitado = new int[numeroPremiados];
	
		for(int contador = 0; contador < numeroPremiados; contador++) {
			System.out.println("informe o tamanho da camiseta do premiado " + (contador+1)+"," + " sendo 1-Pequena e 2-Média");
			tamanhoSolicitado[contador] = ler.nextInt();	
		}
		
	
		System.out.println("informe o número de camisetas Pequenas Produzidas");
		int camisetaProduzidaP = ler.nextInt();
		
		System.out.println("informe o número de camisetas Médias Produzidas");
		int camisetaProduzidaM = ler.nextInt();
		
		int camisetasPequenasSolicitadas =0;
		int camisetasMediasSolicitadas = 0;
		
		for(int i = 0; i < tamanhoSolicitado.length; i++) {
			if (tamanhoSolicitado[i] == 1) {
				camisetasPequenasSolicitadas++;	
			} else if (tamanhoSolicitado[i] == 2) {
				camisetasMediasSolicitadas++;
			}
		}
		
		if (camisetaProduzidaP >= camisetasPequenasSolicitadas && camisetaProduzidaM >= camisetasMediasSolicitadas){
			System.out.println("S");
		} 
		else{
			System.out.println("N");
		}
		
		ler.close();
	}

}
