package estudo1;

import java.util.Scanner;

public class Ex6_Salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o seu salário:");
		double salario = ler.nextDouble();
		
		
		if (salario <= 2000) {
			double bonusEscola = (salario * 0.10) + 350;
			double totalSalario = salario + bonusEscola;
			System.out.println("Seu salário + beneficios é de " + totalSalario);
		} 
		else if (salario >=2000)  {
			double bonusEscola = (salario * 0.08) + 300;
			double totalSalario = salario + bonusEscola;
			System.out.println("Seu salário + beneficios é de " + totalSalario);
		}
		else if (salario >=3000 ){
			double bonusEscola = (salario * 0.05) + 300;
			double totalSalario = salario + bonusEscola;
			System.out.println("Seu salário + benefícios é de " + totalSalario);
		}
		
		ler.close();

	}

}
