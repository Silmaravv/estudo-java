package obi;

import java.util.Scanner;

public class PulodoGato {

	 public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Informe o número total de lajotas");
			        int totalLajotas = sc.nextInt();
			        
			        System.out.println("Informe cada lajota por vez, sendo 1 para preta e 0 para branca");
			        int primeiraLajota = sc.nextInt(); 
			        if (primeiraLajota == 0) {
			            System.out.println("-1");
			            return;
			        }
			       

			        int pulos = 0; 
			        int posicaoAtual = 0; 
			        
			        
			        int ultimaLajota = 1; 
			        for (int contador = 1; contador < totalLajotas; contador++) {
			            int lajotaAtual = sc.nextInt();
			            // é possivel chegar na última lajota
			            
			            if (contador == totalLajotas - 1) {
			                ultimaLajota = lajotaAtual;
			            }
			            // Se a lajota atual é preta e a anterior também era preta
			            if (lajotaAtual == 1) {
			                pulos++;
			                posicaoAtual = contador; // Atualiza a posição atual
			            } else if (lajotaAtual == 0 && posicaoAtual == contador - 1) {
			                // Se encontramos uma lajota branca e a anterior era preta, tentamos pular
			                if (contador + 1 < totalLajotas && sc.nextInt() == 1) {
			                    pulos++; // Se a próxima lajota é preta, pula
			                    posicaoAtual = contador + 1; // Atualiza a posição
			                    contador++; // Avança para a próxima lajota
			                } else {
			                    System.out.println("-1");
			                    return;
			                }
			            }
			        }

			        // Verifica se chegamos à última lajota
			        if (ultimaLajota == 1) {
			            System.out.println(pulos);
			        } else {
			            System.out.println("-1");
			        }
		}
		 
	    }
	}