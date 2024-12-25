package estudo1;

import java.util.Scanner;

public class Ex15_Vendas2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o código do produto:");
		int codProduto = ler.nextInt();
		System.out.println("Informe o código do país:");
		int codPais = ler.nextInt();
		System.out.println("Informe o peso do produto em kg:");
		double peso = ler.nextDouble();
		
		double gramas = peso * 1000;
		
		double precoPorGrama;
		if (codProduto >= 1 && codProduto <= 4) {
			precoPorGrama = 10;
		}
		else if (codProduto >= 5 && codProduto <= 7) {
			precoPorGrama = 25;
		}
		else {
			precoPorGrama = 35;
		}
		double valor = gramas * precoPorGrama;
		
		double imposto;
		if (codPais == 1) {
			imposto = 0;
		}
		else if (codPais == 2) {
			imposto = 0.15;
		}
		else {
			imposto = 0.25;
		}
		double valorTotal = valor * (1.0 + imposto);

		System.out.println("Peso do produto em gramas: " + gramas);
		System.out.println("Preço do produto comprado: " + valor);
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor total: " + valorTotal);
	}

}
