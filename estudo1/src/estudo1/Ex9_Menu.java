package estudo1;

import java.util.Scanner;

public class Ex9_Menu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("\n**** Menu de opções ****\n" + "\n1. Somar dois números" +
				 "\n2. Raiz quadrada de um número\n" + "3. Elevar um número a uma potência\n" + "\n**** Digite a opção desejada ****");

	
		double opcao;
		opcao = scan.nextInt();	
		if(opcao == 1) {
			System.out.println("informe 2 números que serão somados:");
			double n1 = scan.nextInt();
			double n2 = scan.nextInt();
			double soma = n1 +n2;
			System.out.println(soma);
			
		} 
		
		
		else if(opcao == 2){
			System.out.println("ok, digite o número que deseja saber a raiz");
			double r1 = scan.nextDouble();
			double raiz = Math.sqrt(r1);
			System.out.println(raiz);	
		}
		
		else if(opcao == 3){
			System.out.println("ok, digite o número da base");
			double base = scan.nextDouble();
			System.out.println("ok, digite o número da potência");
			double potencia = scan.nextDouble();
			double resultado = Math.pow(base,potencia);
			System.out.println(base + " elevado " + potencia + " é " + resultado);
		}
			
		
	  }

}
