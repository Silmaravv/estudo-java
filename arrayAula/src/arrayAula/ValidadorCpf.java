package arrayAula;

import java.util.Scanner;

public class ValidadorCpf {

	public static void main(String[] args) {
		int opcao;
		String cpf;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\u001B[0m**** CPF Calculator ****");
			System.out.println("1 - validar CPF");
			System.out.println("2 - gerar CPF");
			System.out.println("3 - encerrar");
			System.out.println("Escolha uma opÃ§Ã£o");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe o cpf");
				cpf = sc.next().replace(".", "").replace("-", "");				
				if (validarCpf(cpf)) {
					System.out.println("\u001B[32mCPF VÃLIDO!!!");
				} else {
					System.out.println("\u001B[31mCPF INVÃLIDO!!!");
				}
				break;
			case 2:
				// com vocÃªs
				break;
			case 3:
				break;
			default:
				System.err.println("OpÃ§Ã£o invÃ¡lida");
			}
		} while (opcao != 3);

	}

	public static boolean validarCpf(String cpf) {
		// utilizando os mÃ©todos criados, validar o CPF
		boolean valido = false;
		// verificar o tamanho e se os caracteres sÃ£o iguais
		if (cpf.length() == 11 && !isTudoIgual(cpf)) {
			// calcula o primeiro DV
			int dv1 = calcDv1(cpf);
			// pega o 1ÂºDV do cpf fornecido
			int dv1Forn = cpf.charAt(9) - 48;
			// verifica se 1ÂºDV estÃ¡ correto
			if (dv1 == dv1Forn) {
				// calcula o segundo DV
				int dv2 = calcDv2(cpf);
				// pega o 2ÂºDV do cpf fornecido
				int dv2Forn = cpf.charAt(10) - 48;
				// verifica se o 2ÂºDV estÃ¡ correto
				if (dv2 == dv2Forn) {
					valido = true;
				}
			}
		}
		return valido;
	}

	public static int calcDv2(String cpf) {
		int soma = 0, fator = 11, resto, dv2;
		// for para percorrer do 1Âº ao 9Âº caractere
		for (int i = 0; i < 10; i++) {
			// pegar o caractere na posiÃ§Ã£o e "converter"
			// o valor para int, subtraindo a posiÃ§Ã£o do 0
			// na ASCII
			int n = cpf.charAt(i) - 48;
			// multiplica o numero pelo fator e acrescenta
			// Ã  soma
			soma += fator * n;
			// decrementa o fator
			fator--;
		}
		// calcula o resto da divisÃ£o da soma por 11
		resto = soma % 11;
		// se o resto for 0 ou 1, o dv1 serÃ¡ 0, senÃ£o serÃ¡
		// 11 - resto
		dv2 = resto < 2 ? 0 : 11 - resto;
		return dv2;
	}

	public static int calcDv1(String cpf) {
		int soma = 0, fator = 10, resto, dv1;
		// for para percorrer do 1Âº ao 9Âº caractere
		for (int i = 0; i < 9; i++) {
			// pegar o caractere na posiÃ§Ã£o e "converter"
			// o valor para int, subtraindo a posiÃ§Ã£o do 0
			// na ASCII
			int n = cpf.charAt(i) - 48;
			// multiplica o numero pelo fator e acrescenta
			// Ã  soma
			soma += fator * n;
			// decrementa o fator
			fator--;
		}
		// calcula o resto da divisÃ£o da soma por 11
		resto = soma % 11;
		// se o resto for 0 ou 1, o dv1 serÃ¡ 0, senÃ£o serÃ¡
		// 11 - resto
		dv1 = resto < 2 ? 0 : 11 - resto;
		return dv1;
	}

	public static boolean isTudoIgual(String cpf) {
		// pega o 1Âº caractere
		char cInicio = cpf.charAt(0);
		for (int i = 1; i < 9; i++) {
			char carac = cpf.charAt(i);
			// se entrar nesse if Ã© pq tem um caractere diferente
			if (cInicio != carac) {
				return false;
			}
		}
		// se chegou aqui, todos caracteres sÃ£o iguais
		return true;
	}

}