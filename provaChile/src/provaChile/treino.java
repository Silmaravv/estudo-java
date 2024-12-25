package provaChile;

import java.util.Scanner;

public class treino {

	public static void main(String[] args) {
		
		timeFutebol ();
		
		/*13.
Em um campeonato de futebol existem cinco times e cada um possui quinze jogadores.
 Faça um algoritmo que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:

A quantidade de jogadores com idade inferior a 18 anos;
A média das idades dos jogadores de cada time;
A média das alturas de todos os jogadores do campeonato;
O percentual de jogadores com mais de 80 Kg entre todos os jogadores do campeonato.*/
		


	}
	
	
	 public static void timeFutebol (){
		 
			Scanner ler = new Scanner (System.in);
		 
		 
			System.out.println("Informe a idade do jogador:");
			int idade = ler.nextInt();
			System.out.println("Informe a Altura do jogador");
			double altura = ler.nextDouble();
			System.out.println("Informe o peso do jogador:");
			double peso = ler.nextDouble();
			
			double mediaIdade = (idade * 5) /15;
			
			
	 }

}
