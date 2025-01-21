package obi;

import java.util.Scanner;

public class Ex3_torneioTenis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner venceu = new Scanner (System.in);
		
		int qtdVitoria = 0;
		
		for (int cont =1; cont <= 6; cont++) {
			String jogo = venceu.next();
			
			if (jogo.equals("v")) {
				qtdVitoria++;
			}
		}
		
		if (qtdVitoria == 6 || qtdVitoria == 5){
			System.out.println(1);
		} 
		else if (qtdVitoria == 4 || qtdVitoria == 3){
			System.out.println(2);
		}
		else if (qtdVitoria == 2 || qtdVitoria == 1){
			System.out.println(3);
		}
		else {
			System.out.println("-1");
		}
		
		venceu.close();
	}

}
