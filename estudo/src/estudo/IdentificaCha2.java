package estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentificaCha2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int T = ler.nextInt();
		ler.nextLine();
		String[] lista = ler.nextLine().split(" ");
		int cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (Integer.valueOf(lista[i]) == T) {
				cont++;
			}
		}
		
		System.out.println(cont);
	}

}
