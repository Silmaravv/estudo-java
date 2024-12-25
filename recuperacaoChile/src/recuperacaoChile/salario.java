package recuperacaoChile;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o salário bruto:");
		int salarioBruto= ler.nextInt();
		
		System.out.println("Informe a quantidade de dependentes(digite 0 se não tiver nenhum):");
		int dependentes = ler.nextInt();
		
		System.out.println("possui vale transporte digite 1-sim e 2-não");
		int transporte = ler.nextInt();
		
		System.out.println("possui vale refeição digite 1-sim e 2-não");
		int vr = ler.nextInt();		
		
		
		// 2 desconto do inss
		
		double descInss = 0;
		
	 if (salarioBruto <=1412) { 
		 
		 descInss = salarioBruto * 7.5/100;
		 
	 } 
	 
	 else if (salarioBruto <=2666.68) {
		 
		  descInss = (salarioBruto * 9/100) - 21.18;
	 }
	 
	 else if  (salarioBruto <= 4000.03 ) {
		 
		  descInss = (salarioBruto * 12/100) - 101.18;
		 
	 }
	 else if  (salarioBruto <= 7786.02 ) {
		 
		  descInss = (salarioBruto * 14/100) - 181.18;
		 }
	 else if  (salarioBruto > 7786.02 ) {
		 
		 descInss = 908.86;
		 
		 
		 }
	 
	 
	 
	 // 3 - desconto do transporte (VT)
	 
	 double descVt = 0;
	 if (transporte == 1) {
		 
		 descVt =  salarioBruto* 6/100;
	 }
	 
	 double descVr = 0;
	 // 4 - Desconto do Vale Refeição (VR)
	if (vr==1 && salarioBruto <=3000) {
		 descVr = 22*2.60; 
	 }
	else if(vr==1 && salarioBruto <= 5000) {
		 
		  descVr = 22*3.65;
	 }
	else if(vr==1 && salarioBruto > 5000) {
		 
		 descVr = 22*6.50;
	 }
	 
	 // 5 - dsconto do imposto de renda (IRRF)
	 
	 
	 double baseCalculo = salarioBruto - descInss;
	 
	 
	  if(baseCalculo <=2259.20) {
		 System.out.println("Você é isento do Imposto de Renda");
	 }
	  
	  double iR = 0;
	  
	  if (baseCalculo <=2826.65) {
		  	
		  iR = (baseCalculo * 7.5/100) - 169.44 *dependentes;
	  }
	 
	  else if (baseCalculo <=3751.05) {
		  	
		  iR = (baseCalculo * 15/100) - 381.44 *dependentes;
	  }
	  else if (baseCalculo <=4664.68) {
		  	
		  iR = (baseCalculo * 22.5/100) - 662.77 * dependentes;
	  }
	  
	  else if (baseCalculo >=4664.68) {
		  	
		  iR = (baseCalculo * 27.5/100) - 896.00 * dependentes;
	  }
	  

	  double salarioLiquido = baseCalculo- iR-descVr-descVt;
	  
	  System.out.println("o seu salário liquido é de " + salarioLiquido);
			  
	}

}
