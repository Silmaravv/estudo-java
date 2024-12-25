package estudo1;

import java.util.Scanner;

public class Ex10_Hora {

	public static void main(String[] args) {
		
		/*Crie um algoritmo que receba a hora de início e a hora de término de um jogo
(cada hora é composta por duas variáveis hora e minuto). Calcule e mostre a duração do jogo (horas e minutos),
 sabendo-se que o tempo máximo daduração do jogo é de 24 horas e que ele pode iniciar-se em um dia e terminar
no dia seguinte. */
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe somente a hora que o jogo iniciou:");
		int horaInicio = ler.nextInt();
		System.out.println("Informe somente o minuto que o jogo iniciou:");
		int minInicio = ler.nextInt();
		System.out.println("Informe somente a hora que o jogo terminou:");
		int horaFim = ler.nextInt();
		System.out.println("Informe os minutos que o jogo terminou:");
		int minFim = ler.nextInt();
		
		int horaDura = horaFim - horaInicio;
		int minDura = minFim - minInicio;
		
		if (horaDura < 0) { 
			horaDura = 24+horaDura;
			
		}
		
		if (minDura < 0) {
			horaDura = horaDura - 1;
			minDura = 60+minDura;
		}
		System.out.println("a duração é de " + horaDura + ":" + minDura);
		
		ler.close();
	}

}
