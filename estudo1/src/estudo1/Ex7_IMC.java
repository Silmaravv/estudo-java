package estudo1;

import java.util.Scanner;

public class Ex7_IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o peso:");
		double peso = scanner.nextDouble();
		System.out.println("Informe a altura:");
		double altura = scanner.nextDouble();	
		
		String classificacao = IMC.getClassificacao(peso, altura);
		System.out.println("Sua classificação é " + classificacao);
	}
	
	private static enum IMC {
		
		MAGREZA_SEVERA("Magreza Severa", "\u001B[31m", 0, 16),
		
		MAGREZA_MODERADA("Magreza Moderada", "\u001B[33m", 16, 17),
		
		MAGREZA_LEVE("Magreza Leve", "\u001B[36m", 17, 18.5),
		
		NORMAL("Normal", "\u001B[32m", 18.5, 25),
		
		OBESIDADE_LEVE("Obesidade Leve", "\u001B[36m", 25, 30),
		
		OBESIDADE_SEVERA("Obesidade Severa", "\u001B[33m", 30, 40),
		
		OBESIDADE_MORBIDA("Obesidade Mórbida", "\u001B[31m", 40, Double.MAX_VALUE);
		
		private final String nomeBonito;
		private final String cor;
		private final double inicio;
		private final double fim;
		
		private IMC(String nomeBonito, String cor, double inicio, double fim) {
			this.nomeBonito = nomeBonito;
			this.cor = cor;
			this.inicio = inicio;
			this.fim = fim;
		}
		
		public static String getClassificacao(double peso, double altura) {
			double valorImc = peso / (altura * altura);
			for (IMC imc : IMC.values()) {
				if (imc.inicio <= valorImc && valorImc < imc.fim) {
					return imc.cor + imc.nomeBonito;
				}
			}
			throw new RuntimeException("Deu pau :)");
		}
		
	}

}
