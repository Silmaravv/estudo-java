package estudo1;

import java.util.Scanner;

public class Ex14_Vendas {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o código do produto:");
		String cod = ler.nextLine();
		System.out.println("Informe a quantidade comprada:");
		double qtdeVenda =ler.nextDouble();
		
		double valorVenda = -1;
		if(cod.equals("A001")) {
			valorVenda = qtdeVenda * 7.50;
		}
		else if(cod.equals("A002")) {
			valorVenda = qtdeVenda * 9.90;
		}
		else if(cod.equals("A003")) {
			valorVenda = qtdeVenda * 14.00;
		}
		else if(cod.equals("A004")) {
			valorVenda = qtdeVenda * 19.99;
		}

		if (valorVenda == -1) {
			System.out.println("código não válido");
		}
		else {
			System.out.println("O total a pagar é de " + valorVenda);
		}
	}

}
