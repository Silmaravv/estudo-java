package arrayAula;

import java.util.Scanner;

public class ExArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double[] notas = new double [4];
		for(int i = 0; i <4; i++) {
			System.out.println("informe a nota" + (i + 1));
			notas[i] = sc .nextDouble();
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("Nota %d: %5.2f%n", i +1, notas[i]);
		}
		
		//for each para cada double N recebe o valor
		for (double n : notas) {
			System.out.printf("Nota: %5.2f%n", n);
		}

	}

}
