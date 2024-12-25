package arrayAula;

import java.util.Random;
import java.util.Scanner;

public class ExArray3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][][] idades;
		int totCamp, totTimes, totJog;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos campeonatos?");		
		totCamp = sc.nextInt();
		System.out.println("Quantos times em cada campeonato?");		
		totTimes = sc.nextInt();
		System.out.println("Quantos jogadores em cada time?");
		totJog = sc.nextInt();
		// criando o array
		idades = new int[totCamp][totTimes][totJog];
		
		// preenchendo as idades
		for (int camp = 0; camp < idades.length; camp++) {
			for (int time = 0; time < idades[camp].length; time++) {
				for (int jog = 0; jog < idades[camp][time].length; jog++) {
					System.out.println("Informe a idade");
					idades[camp][time][jog] = rand.nextInt(16, 24);
				}
			}
		}
		// usando for each
		for (int camp[][] : idades) {
			for (int time[] : camp) {
				for (int jog : time) {
					System.out.println("Idade: " + jog);
				}
			}
		}
	}
}
