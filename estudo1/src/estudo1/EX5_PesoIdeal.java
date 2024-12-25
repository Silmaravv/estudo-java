package estudo1;

import java.util.Scanner;

public class EX5_PesoIdeal {

	public static void main(String[] args) {
		System.out.println("Informe o seu sexo (F ou M) e altura em Cm:");
	
		Scanner ler = new Scanner(System.in);
		String sexo = ler.next();
		double alt = ler.nextDouble();
		
		double indice = 0;
		if (sexo.equals("F")) { 
			indice = 52 + (0.67 * (alt - 152.4));
			System.out.println ( "seu peso ideal é " + indice);	
		}
		
		else if (sexo.equals("M")){
			indice = 52 + (0.75 * (alt - 152.4));
			System.out.println(" seu peso ideal é " + indice);
		}
		
	}

}

